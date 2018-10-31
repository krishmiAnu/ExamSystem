/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.business.custom.ManageQuestionBO;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.entity.ExamPaper;
import lk.ijse.edu.entity.Question;
import lk.ijse.edu.entity.Subject;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.ManageQuestionRepository;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class QuestionBOImpl implements ManageQuestionBO {

    private ManageQuestionRepository manageQuestionRepository;

    public QuestionBOImpl() {
        this.manageQuestionRepository = (ManageQuestionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.MANAGEQUESTION);
    }

    @Override
    public boolean updateManageQuestion(QuestionDTO manageQuestionDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteManageQuestion(String ManageQuestionId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QuestionDTO> getAllManageQuestions() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            manageQuestionRepository.setSession(session);
            session.beginTransaction();
            List<Question> questions = manageQuestionRepository.findAll();
            session.getTransaction().commit();

            List<QuestionDTO> alQuestions = new ArrayList<>();
            for (Question question : questions) {
                //QuestionDTO questionDTO = new QuestionDTO(question.getQuestionId(), question.getSubject(), question.getQuestion(), question.getAnswer1(), question.getAnswer2(), question.getAnswer3(), question.getAnswer4(), question.getDate(), question.getCarrectAnswer());
                
                QuestionDTO questionDTO = new QuestionDTO(question.getQuestionId(), question.getSubject(), question.getQuestion(), question.getAnswer1(), question.getAnswer2(), question.getAnswer3(), question.getAnswer4(), question.getDate(), question.getCarrectAnswer(),
                new PaperDTO(question.getExamPaper().getPaperId(), question.getExamPaper().getExamTitle(), 
                        new SubjectDTO(question.getExamPaper().getSubject().getSubjectId(), question.getExamPaper().getSubject().getSubjectName()),
                        question.getExamPaper().getDuration(), question.getExamPaper().getDate(), question.getExamPaper().getTime(), question.getExamPaper().getQuestionCount())
                );
                alQuestions.add(questionDTO);
            }
            return alQuestions;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean addManageQuestion(QuestionDTO manageQuestionDTO, PaperDTO paperDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            manageQuestionRepository.setSession(session);
            session.beginTransaction();
            Subject subject = new Subject(paperDTO.getSubjectDTO().getSubjectId(), paperDTO.getSubjectDTO().getSubjectName());

            ExamPaper paper = new ExamPaper(
                    paperDTO.getPaperId(),
                    paperDTO.getExamTitle(),
                    subject,
                    paperDTO.getDuration(),
                    paperDTO.getDate(),
                    paperDTO.getTime(),
                    paperDTO.getQuestionCount()
            );

            Question q = new Question(
                    manageQuestionDTO.getQuestionID(),
                    manageQuestionDTO.getQuestion(),
                    manageQuestionDTO.getSubject(),
                    manageQuestionDTO.getAnswer1(),
                    manageQuestionDTO.getAnswer2(),
                    manageQuestionDTO.getAnswer3(),
                    manageQuestionDTO.getAnswer4(),
                    manageQuestionDTO.getDate(),
                    manageQuestionDTO.getCarrectAnswer(),
                    paper
            );
            List<Question> questions = new ArrayList<>();
            questions.add(q);
            paper.setQuestions(questions);
            
            boolean result = manageQuestionRepository.save(q);

            session.getTransaction().commit();

            return result;
        }
    }

    @Override
    public QuestionDTO search(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
          session.beginTransaction();
          manageQuestionRepository.setSession(session);
          Question question = (Question) session.createQuery("from Question where id='"+id+"'");
          
          QuestionDTO questionDTO = new QuestionDTO();
          questionDTO.setQuestionID(question.getQuestionId());
          questionDTO.setQuestion(question.getQuestion());
          questionDTO.setAnswer1(question.getAnswer1());
          questionDTO.setAnswer2(question.getAnswer2());
          questionDTO.setAnswer2(question.getAnswer3());
          questionDTO.setAnswer2(question.getAnswer4());
          
          session.close();
          return questionDTO;
        }
    }

}
