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
import lk.ijse.edu.business.custom.AnswerBO;
import lk.ijse.edu.dto.AnswerDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.service.custom.AnswerService;

/**
 *
 * @author Krishanthi
 */
public class AnswerServiceImpl extends UnicastRemoteObject implements AnswerService, Subject {

    private AnswerBO answerBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public AnswerServiceImpl() throws RemoteException {
        answerBO = (AnswerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ANSWER);
    }

    @Override
    public boolean addAnswer(AnswerDTO answerDTO) throws Exception {
        boolean result = answerBO.addAnswer(answerDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteAnswer(String answerId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAnswer(AnswerDTO answerDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AnswerDTO> getAllAnswers() throws Exception {
        return answerBO.getAllAnswers();
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
                    Logger.getLogger(AnswerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
}
