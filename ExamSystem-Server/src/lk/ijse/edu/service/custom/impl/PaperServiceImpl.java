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
import lk.ijse.edu.business.custom.PaperBO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.service.custom.PaperService;

/**
 *
 * @author Krishanthi
 */
public class PaperServiceImpl extends UnicastRemoteObject implements PaperService, Subject {

    private PaperBO paperBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public PaperServiceImpl() throws RemoteException {
        paperBO = (PaperBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PAPER);
    }

    @Override
    public boolean addPaper(PaperDTO paper) throws Exception {
        boolean result = paperBO.addPaper(paper);
//        notifyObservers();
        return result;
    }

    @Override
    public boolean deletePaper(String paperId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePaper(PaperDTO paper) throws Exception {
        return paperBO.updatePaper(paper);
    }

    @Override
    public List<PaperDTO> getAllPapers() throws Exception {
        return paperBO.getAllPapers();
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
                    Logger.getLogger(PaperServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public PaperDTO searchPaper(String title, String subject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
