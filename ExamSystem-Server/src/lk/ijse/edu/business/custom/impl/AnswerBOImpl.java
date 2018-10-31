/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.List;
import java.util.logging.Logger;
import lk.ijse.edu.business.custom.AnswerBO;
import lk.ijse.edu.dto.AnswerDTO;
import lk.ijse.edu.entity.Answer;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.AnswerRepository;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class AnswerBOImpl implements AnswerBO{
    
    private AnswerRepository answerRepository;

    public AnswerBOImpl() {
        this.answerRepository = (AnswerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ANSWER);
    }

    @Override
    public boolean addAnswer(AnswerDTO answerDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            answerRepository.setSession(session);
            
            session.beginTransaction();
            
            Answer a = new Answer(answerDTO.getAnswerID(),
                    answerDTO.getAnswer()
                    );
            boolean result = answerRepository.save(a);
            
            session.getTransaction().commit();

            return result;
        }
        
        
        
       
        
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @Override
    public boolean updateAnswer(AnswerDTO answerDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAnswer(String answerId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AnswerDTO> getAllAnswers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
