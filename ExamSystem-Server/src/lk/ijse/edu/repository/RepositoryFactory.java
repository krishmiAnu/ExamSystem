/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository;

import lk.ijse.edu.repository.custom.impl.AnswerRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.ManageQuestionRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.PaperRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.RegistrationRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.ResultRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.StudentRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.SubjectRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.UserHistoryRepositoryImpl;
import lk.ijse.edu.repository.custom.impl.UserRepositoryImpl;

/**
 *
 * @author Krishanthi
 */
public class RepositoryFactory {
    
    public enum RepositoryTypes{
        PAPER, REGISTRATION, MANAGEQUESTION, ANSWER,RESULT,STUDENT,SUBJECT,USER,USERHISTORY
    }
    public static RepositoryFactory repositoryFactory;
    
    private RepositoryFactory(){
        
    }
    public static RepositoryFactory getInstance(){
        if(repositoryFactory == null){
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }
    public SuperRepository getRepository(RepositoryTypes types){
        switch(types){
            case PAPER:
                return new PaperRepositoryImpl();
            case REGISTRATION:
                return new RegistrationRepositoryImpl();
            case MANAGEQUESTION:
                return new ManageQuestionRepositoryImpl();
            case ANSWER:
                return new AnswerRepositoryImpl();
            case RESULT:
                return new ResultRepositoryImpl();
            case STUDENT:
                return new StudentRepositoryImpl();
            case SUBJECT:
                return new SubjectRepositoryImpl();
            case USER:
                return new UserRepositoryImpl();
            case USERHISTORY:
                return new UserHistoryRepositoryImpl();    
            default:
                return null;
        }
    }
}
