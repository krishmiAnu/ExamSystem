/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.business.custom.ResultBO;
import lk.ijse.edu.dto.ResultDTO;
import lk.ijse.edu.entity.Result;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.ResultRepository;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class ResultBOImpl implements ResultBO{
    
    private ResultRepository resultRepository;

    public ResultBOImpl() {
        this.resultRepository = (ResultRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.RESULT);
    }

    @Override
    public boolean addResult(ResultDTO resultDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateResult(ResultDTO resultDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteResult(String resultId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ResultDTO> getAllResults() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            resultRepository.setSession(session);
            session.beginTransaction();
            List<Result> questions = resultRepository.findAll();
            session.getTransaction().commit();

            List<ResultDTO> alResult = new ArrayList<>();
            for (Result result : questions) {
                //ResultDTO resultDTO = new ResultDTO(result.getStudent().getNic(), result.getStudent().getName(), result.getExam().getPaperId(), result.getExam().getExamTitle(), result.getExam().getSubject(), result.getMarks(), result.getState());
                ResultDTO dto = new ResultDTO(result.getStudent().getNic(),
                        result.getStudent().getName(),
                        Integer.toString(result.getExam().getPaperId()),
                        result.getExam().getExamTitle(),
                        result.getExam().getSubject().getSubjectName(),
                        result.getMarks(),
                        result.getState()
                );
                alResult.add(dto);
            }
            return alResult;
        }
    }
    
}
