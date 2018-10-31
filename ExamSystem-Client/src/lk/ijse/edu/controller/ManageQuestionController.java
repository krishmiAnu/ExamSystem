/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.ManageQuestionService;

/**
 *
 * @author Krishanthi
 */
public class ManageQuestionController {
    public static boolean addManageQuestion(QuestionDTO manageQuestion,PaperDTO paper) throws Exception{
        ManageQuestionService manageQuestionService = (ManageQuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.MANAGEQUESTION);
        return manageQuestionService.addManageQuestion(manageQuestion,paper);
    }
    
    public static boolean updateManageQuestion(QuestionDTO manageQuestion) throws Exception{
        ManageQuestionService manageQuestionService = (ManageQuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.MANAGEQUESTION);
        return manageQuestionService.updateManageQuestion(manageQuestion);
    }

    public static boolean deleteManageQuestion(String manageQuestionId) throws Exception{
        ManageQuestionService manageQuestionService = (ManageQuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.MANAGEQUESTION);
        return manageQuestionService.deleteManageQuestion(manageQuestionId);
    }    
    
    public static List<QuestionDTO> getAllManageQuestions() throws Exception{
        ManageQuestionService manageQuestionService = (ManageQuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.MANAGEQUESTION);
        return manageQuestionService.getAllManageQuestions();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.MANAGEQUESTION);
    }
    
    public static QuestionDTO SearchQuestion(String questionId) throws Exception{
        ManageQuestionService manageQuestionService = (ManageQuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.MANAGEQUESTION);
        return manageQuestionService.searchQuestion(questionId);
    }
}
