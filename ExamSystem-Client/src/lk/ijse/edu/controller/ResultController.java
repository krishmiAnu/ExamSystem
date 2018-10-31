/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.ResultDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.ResultService;

/**
 *
 * @author Krishanthi
 */
public class ResultController {
    public static boolean addResult(ResultDTO resultDTO) throws Exception{
        ResultService resultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return resultService.addResult(resultDTO);
    }
    
    public static boolean updateResult(ResultDTO resultDTO) throws Exception{
        ResultService resultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return resultService.updateResult(resultDTO);
    }

    public static boolean deleteResult(String resultId) throws Exception{
        ResultService resultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return resultService.deleteResult(resultId);
    }    
    
    public static List<ResultDTO> getAllResults() throws Exception{
        ResultService resultService = (ResultService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
        return resultService.getAllResults();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.RESULT);
    }
}
