/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.UserHistoryDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.UserHistoryService;

/**
 *
 * @author Krishanthi
 */
public class UserHistoryController {
    
//    public static boolean addUserHistory(UserHistoryDTO userHistoryDTO) throws Exception{
//        UserHistoryService userHistoryService = (UserHistoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USERHISTORY);
//        return userHistoryService.addUserHistory(userHistoryDTO);
//    }
    
    public static boolean updateUserHistory(UserHistoryDTO userHistoryDTO) throws Exception{
        UserHistoryService userHistoryService = (UserHistoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USERHISTORY);
        return userHistoryService.updateUserHistory(userHistoryDTO);
    }

    public static boolean deleteUserHistory(String userHistoryId) throws Exception{
        UserHistoryService userHistoryService = (UserHistoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USERHISTORY);
        return userHistoryService.deleteUserHistory(userHistoryId);
    }    
    
    public static List<UserHistoryDTO> getAllUserHistorys() throws Exception{
        UserHistoryService userHistoryService = (UserHistoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USERHISTORY);
        return userHistoryService.getAllUserHistorys();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USERHISTORY);
    }
    
}
