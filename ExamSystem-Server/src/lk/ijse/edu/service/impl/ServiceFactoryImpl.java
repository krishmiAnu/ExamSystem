/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.SuperService;
import lk.ijse.edu.service.custom.impl.AnswerServiceImpl;
import lk.ijse.edu.service.custom.impl.PaperServiceImpl;
import lk.ijse.edu.service.custom.impl.QuestionServiceImpl;
import lk.ijse.edu.service.custom.impl.RegistrationServiceImpl;
import lk.ijse.edu.service.custom.impl.StudentServiceImpl;
import lk.ijse.edu.service.custom.impl.SubjectServiceImpl;

/**
 *
 * @author Krishanthi
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    
    public static ServiceFactory serviceFactory;
    
    private ServiceFactoryImpl() throws RemoteException{
    
    }
    public static ServiceFactory getInstance() throws RemoteException{
        if(serviceFactory == null){
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceTypes types) throws Exception {
        switch(types){
            case PAPER:
                return new PaperServiceImpl();
            case REGISTRATION:
                return new RegistrationServiceImpl();
            case SUBJECT:
                return new SubjectServiceImpl();
            case STUDENT:
                return new StudentServiceImpl();
            case MANAGEQUESTION:
                return new QuestionServiceImpl();
            case ANSWER:
                return new AnswerServiceImpl();
            default:
                return null;
        }
    }
}
