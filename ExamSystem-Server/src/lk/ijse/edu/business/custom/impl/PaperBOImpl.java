/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.business.custom.PaperBO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.entity.ExamPaper;
import lk.ijse.edu.entity.Question;
import lk.ijse.edu.entity.Subject;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.ManageQuestionRepository;
import lk.ijse.edu.repository.custom.PaperRepository;
import org.hibernate.Session;
import lk.ijse.edu.resource.HibernateUtil;

/**
 *
 * @author Krishanthi
 */
public class PaperBOImpl implements PaperBO {

    private PaperRepository paperRepository;
    private ManageQuestionRepository manageQuestionRepository;

    public PaperBOImpl() {
        this.paperRepository = (PaperRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.PAPER);
        this.manageQuestionRepository = (ManageQuestionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.MANAGEQUESTION);
    }

    @Override
    public boolean addPaper(PaperDTO paper) throws Exception {
        System.out.println("paperBOIpml "+paper);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            paperRepository.setSession(session);
            manageQuestionRepository.setSession(session);
            session.beginTransaction();
            Subject subject = new Subject(paper.getSubjectDTO().getSubjectId(), paper.getSubjectDTO().getSubjectName());
            ExamPaper examPaper = new ExamPaper(paper.getPaperId(),
                    paper.getExamTitle(),
                    subject,
                    paper.getDuration(),
                    paper.getDate(),
                    paper.getTime(),
                    paper.getQuestionCount()
            );

            int i =0;
            List<Question> questions = new ArrayList<>();
            for (QuestionDTO questionDTO : paper.getQuestionList()) {
                Question question = new Question(questionDTO.getQuestionID(), questionDTO.getQuestion(), questionDTO.getSubject(), questionDTO.getAnswer1(), questionDTO.getAnswer2(), questionDTO.getAnswer3(), questionDTO.getAnswer4(), questionDTO.getCarrectAnswer(), questionDTO.getDate(), examPaper);
                questions.add(question);
                if(manageQuestionRepository.save(question)){
                    i++;
                }
            }
            examPaper.setQuestions(questions);

            boolean result = paperRepository.save(examPaper);
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public boolean updatePaper(PaperDTO paper) throws Exception {
        Subject subject = new Subject(paper.getSubjectDTO().getSubjectId(), paper.getSubjectDTO().getSubjectName());
        ExamPaper examPaper = new ExamPaper(paper.getPaperId(),
                paper.getExamTitle(),
                subject,
                paper.getDuration(),
                paper.getDate(),
                paper.getTime(),
                paper.getQuestionCount()
        );

        List<Question> questions = new ArrayList<>();
        for (QuestionDTO questionDTO : paper.getQuestionList()) {
            Question question = new Question(questionDTO.getQuestionID(), questionDTO.getQuestion(), questionDTO.getSubject(), questionDTO.getAnswer1(), questionDTO.getAnswer2(), questionDTO.getAnswer3(), questionDTO.getAnswer4(), questionDTO.getCarrectAnswer(), questionDTO.getDate(), examPaper);
            questions.add(question);
        }
        examPaper.setQuestions(questions);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            paperRepository.setSession(session);
            session.beginTransaction();
            paperRepository.update(examPaper);
            session.getTransaction().commit();
            return true;
        }
    }

    @Override
    public boolean deletePaper(String paperId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaperDTO> getAllPapers() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            paperRepository.setSession(session);
            session.beginTransaction();
            List<ExamPaper> papers = paperRepository.findAll();
            session.getTransaction().commit();

            List<PaperDTO> alPapers = new ArrayList<>();
            for (ExamPaper paper : papers) {
                SubjectDTO subjectDTO = new SubjectDTO(paper.getSubject().getSubjectId(), paper.getSubject().getSubjectName());
                PaperDTO dto = new PaperDTO(paper.getPaperId(),
                        paper.getExamTitle(),
                        subjectDTO,
                        paper.getDuration(),
                        paper.getDate(),
                        paper.getTime(),
                        paper.getQuestionCount()
                );
                alPapers.add(dto);
            }
            return alPapers;
        }
    }
}
