/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service;

import java.rmi.Remote;

/**
 *
 * @author Krishanthi
 */
public interface ServiceFactory extends Remote{
    
    public enum ServiceTypes{
        PAPER,REGISTRATION,MANAGEQUESTION,ANSWER,RESULT,STUDENT,SUBJECT,USER,USERHISTORY
    }
    public SuperService getService(ServiceTypes types) throws Exception;
}
