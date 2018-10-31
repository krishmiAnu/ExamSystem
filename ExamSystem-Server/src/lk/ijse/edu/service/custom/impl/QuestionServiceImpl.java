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
import lk.ijse.edu.business.custom.ManageQuestionBO;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.service.custom.ManageQuestionService;

/**
 *
 * @author Krishanthi
 */
public class QuestionServiceImpl extends UnicastRemoteObject implements ManageQuestionService, Subject {

    private ManageQuestionBO manageQuestionBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public QuestionServiceImpl() throws RemoteException {
        manageQuestionBO = (ManageQuestionBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.MANAGEQUESTION);
    }

    
    @Override
    public boolean deleteManageQuestion(String manageQuestionId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateManageQuestion(QuestionDTO manageQuestionDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QuestionDTO> getAllManageQuestions() throws Exception {
        return manageQuestionBO.getAllManageQuestions();
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
                    Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean addManageQuestion(QuestionDTO manageQuestionDTO, PaperDTO paperDTO) throws Exception {
        boolean result = manageQuestionBO.addManageQuestion(manageQuestionDTO,paperDTO);
        notifyObservers();
        return result;
    }

    @Override
    public QuestionDTO searchQuestion(String id) throws Exception {
        QuestionDTO questionDTO = manageQuestionBO.search(id);
        return questionDTO;
    }

}
