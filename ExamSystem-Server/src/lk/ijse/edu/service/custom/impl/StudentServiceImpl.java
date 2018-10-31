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
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.service.custom.StudentService;

/**
 *
 * @author Krishanthi
 */
public class StudentServiceImpl extends UnicastRemoteObject implements StudentService,Subject{
    
    private StudentBO studentBO;
    //private SubjectBO subjectBO;
    //private RegistrationBO registrationBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public StudentServiceImpl() throws RemoteException {
        
        //registrationBO = (RegistrationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.REGISTRATION);
        studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
        //subjectBO = (SubjectBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SUBJECT);
    }

    @Override
    public boolean addStudent(StudentDTO studentDTO) throws Exception {
        boolean result = studentBO.addStudent(studentDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteStudent(String StudentId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentDTO> getAllStudents() throws Exception {
        return studentBO.getAllStudents();
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
                    Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public StudentDTO searchStudent(String nic) throws Exception {
        StudentDTO studentDTO1 = studentBO.search(nic);
        return studentDTO1;
    }
}
