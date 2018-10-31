/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business;

import lk.ijse.edu.business.custom.impl.AnswerBOImpl;
import lk.ijse.edu.business.custom.impl.QuestionBOImpl;
import lk.ijse.edu.business.custom.impl.PaperBOImpl;
import lk.ijse.edu.business.custom.impl.RegistrationBOImpl;
import lk.ijse.edu.business.custom.impl.ResultBOImpl;
import lk.ijse.edu.business.custom.impl.StudentBOImpl;
import lk.ijse.edu.business.custom.impl.SubjectBOImpl;
import lk.ijse.edu.business.custom.impl.UserBOImpl;
import lk.ijse.edu.business.custom.impl.UserHistoryBOImpl;

/**
 *
 * @author Krishanthi
 */
public class BOFactory {
    
    public enum BOTypes{
        PAPER, REGISTRATION, MANAGEQUESTION, ANSWER,RESULT,STUDENT,SUBJECT,USER,USERHISTORY
    }
    private static BOFactory bOFactory;
    
    private BOFactory(){
        
    }
    public static BOFactory getInstance(){
        if(bOFactory == null){
           bOFactory = new BOFactory(); 
        }
        return bOFactory;
    }
    public SuperBO getBO(BOTypes types){
        switch(types){
            case PAPER:
                return new PaperBOImpl();
            case REGISTRATION:
                return new RegistrationBOImpl();
            case ANSWER:
                return new AnswerBOImpl();
            case MANAGEQUESTION:
                return new QuestionBOImpl();
            case RESULT:
                return new ResultBOImpl();
            case STUDENT:
                return new StudentBOImpl();
            case SUBJECT:
                return new SubjectBOImpl();
            case USER:
                return new UserBOImpl();
            case USERHISTORY:
                return new UserHistoryBOImpl();    
            default:
                return null;
        }
    }
}
