/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.edu.business.BOFactory;
import lk.ijse.edu.business.custom.RegistrationBO;
import lk.ijse.edu.business.custom.StudentBO;
import lk.ijse.edu.business.custom.SubjectBO;
import lk.ijse.edu.dto.RegistrationDTO;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.service.custom.RegistrationService;
import sun.management.counter.StringCounter;

/**
 *
 * @author Krishanthi
 */
public class RegistrationServiceImpl extends UnicastRemoteObject implements RegistrationService,Subject{
    
    private StudentBO studentBO;
    private SubjectBO subjectBO;
    private RegistrationBO registrationBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public RegistrationServiceImpl() throws RemoteException {
        registrationBO = (RegistrationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.REGISTRATION);
        studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
        subjectBO = (SubjectBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SUBJECT);
    }
//
//    @Override
//    public boolean addRegistration(RegistrationDTO registrationDTO) throws Exception {
//        StudentDTO studentDTO = registrationDTO.getStudentDTO();
//        boolean result = registrationBO.addRegistration(registrationDTO);
//        //boolean result1 = studentBO.addStudent(studentDTO);
////        boolean result2 = subjectBO.addSubject(subjectDTO);
//        notifyObservers();
//        return result;
//    }

    @Override
    public boolean deleteRegistration(String registrationId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistrationDTO> getAllRegistrations() throws Exception {
        return registrationBO.getAllRegistrations();
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        new Thread(() -> {
            for (Observer observer : alObservers) {
                try {
                    observer.updateObservers();
                } catch (Exception ex) {
                    Logger.getLogger(RegistrationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean addRegistration(RegistrationDTO registrationDTO, StudentDTO studentDTO, SubjectDTO subjectDTO) throws Exception {
        boolean result = registrationBO.addRegistration(registrationDTO, studentDTO, subjectDTO);
        notifyObservers();
        return result;
    }
}
