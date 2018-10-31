/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.AnswerDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.AnswerService;

/**
 *
 * @author Krishanthi
 */
public class AnswerController {
    public static boolean addAnswer(AnswerDTO answerDTO) throws Exception{
        AnswerService answerService = (AnswerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ANSWER);
        return answerService.addAnswer(answerDTO);
    }
    
    public static boolean updateAnswer(AnswerDTO answerDTO) throws Exception{
        AnswerService answerService = (AnswerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ANSWER);
        return answerService.updateAnswer(answerDTO);
    }

    public static boolean deleteAnswer(String answerId) throws Exception{
        AnswerService answerService = (AnswerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ANSWER);
        return answerService.deleteAnswer(answerId);
    }    
    
    public static List<AnswerDTO> getAllAnswers() throws Exception{
        AnswerService answerService = (AnswerService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ANSWER);
        return answerService.getAllAnswers();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ANSWER);
    }
}
