/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.PaperService;

/**
 *
 * @author Krishanthi
 */
public class PaperController {
    public static boolean addPaper(PaperDTO paper) throws Exception{
        PaperService paperService = (PaperService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAPER);
        return paperService.addPaper(paper);
    }
    
    public static boolean updatePaper(PaperDTO paper) throws Exception{
        PaperService paperService = (PaperService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAPER);
        return paperService.updatePaper(paper);
    }

    public static boolean deletePaper(String paperId) throws Exception{
        PaperService paperService = (PaperService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAPER);
        return paperService.deletePaper(paperId);
    }    
    
    public static List<PaperDTO> getAllPapers() throws Exception{
        PaperService paperService = (PaperService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAPER);
        return paperService.getAllPapers();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAPER);
    }
    public static PaperDTO SearchPaper(String title,String subject) throws Exception{
        PaperService paperService = (PaperService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.PAPER);
        return paperService.searchPaper(title, subject);
                
    }
}
