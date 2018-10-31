/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository.custom.impl;

import lk.ijse.edu.entity.Question;
import lk.ijse.edu.repository.SuperRepositoryImpl;
import lk.ijse.edu.repository.custom.ManageQuestionRepository;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class ManageQuestionRepositoryImpl extends SuperRepositoryImpl<Question, String> implements ManageQuestionRepository{
    
    public ManageQuestionRepositoryImpl(){
        
    }

    @Override
    public Question getQuestionByID(String id, Session session) throws Exception {
        return (Question) session.createQuery("from Question where id='"+id+"'");
    }
    
}
