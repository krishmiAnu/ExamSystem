/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.edu.dto.AnswerDTO;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.SuperService;
import lk.ijse.edu.service.custom.AnswerService;
import lk.ijse.edu.service.custom.ManageQuestionService;
import lk.ijse.edu.service.custom.PaperService;
import lk.ijse.edu.service.custom.RegistrationService;
import lk.ijse.edu.service.custom.ResultService;
import lk.ijse.edu.service.custom.StudentService;
import lk.ijse.edu.service.custom.SubjectService;
import lk.ijse.edu.service.custom.UserHistoryService;
import lk.ijse.edu.service.custom.UserService;

/**
 *
 * @author Krishanthi
 */
public class ProxyHandler implements ServiceFactory{
    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private PaperService paperService;
    private RegistrationService registrationService;
    private ManageQuestionService manageQuestionService;
    private AnswerService answerService;
    private ResultService resultService;
    private StudentService studentService;
    private SubjectService subjectService;
    private UserService userService;
    private UserHistoryService userHistoryService;
    
    private ProxyHandler(){
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/exam");
            paperService = (PaperService) serviceFactory.getService(ServiceTypes.PAPER);
            registrationService = (RegistrationService) serviceFactory.getService(ServiceTypes.REGISTRATION);
            manageQuestionService = (ManageQuestionService)serviceFactory.getService(ServiceTypes.MANAGEQUESTION);
            answerService = (AnswerService)serviceFactory.getService(ServiceTypes.ANSWER);
            resultService = (ResultService)serviceFactory.getService(ServiceTypes.RESULT);
            studentService = (StudentService)serviceFactory.getService(ServiceTypes.STUDENT);
            subjectService = (SubjectService)serviceFactory.getService(ServiceTypes.SUBJECT);
            userService = (UserService)serviceFactory.getService(ServiceTypes.USER);
            userHistoryService = (UserHistoryService)serviceFactory.getService(ServiceTypes.USERHISTORY);
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstance(){
        if (proxyHandler == null){
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperService getService(ServiceTypes types) throws Exception {
        switch(types){
            case PAPER:
                return paperService;
            case REGISTRATION:
                return registrationService;
            case MANAGEQUESTION:
                return manageQuestionService;
            case ANSWER:
                return answerService;
            case RESULT:
                return resultService;
            case STUDENT:
                return studentService;
            case SUBJECT:
                return subjectService;
            case USER:
                return userService;
            case USERHISTORY:
                return userHistoryService;
            default:
                return null;
        }
    }
}
