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
import lk.ijse.edu.business.custom.SubjectBO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.service.custom.SubjectService;

/**
 *
 * @author Krishanthi
 */
public class SubjectServiceImpl extends UnicastRemoteObject implements SubjectService, Subject {

    private SubjectBO subjectBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public SubjectServiceImpl() throws RemoteException {
        System.out.println("subjectSerivce IMPl");
        subjectBO = (SubjectBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SUBJECT);
    }

    @Override
    public boolean addSubject(SubjectDTO subjectDTO) throws Exception {
        boolean result = subjectBO.addSubject(subjectDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteSubject(String SubjectId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateSubject(SubjectDTO subjectDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubjectDTO> getAllSubjects() throws Exception {
            System.out.println("subjectServiceImpl getAll");
        return subjectBO.getAllSubjects();
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
                    Logger.getLogger(SubjectServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public SubjectDTO serch(SubjectDTO subjectDTO) throws Exception {
        return subjectBO.search(subjectDTO);
    }
}
