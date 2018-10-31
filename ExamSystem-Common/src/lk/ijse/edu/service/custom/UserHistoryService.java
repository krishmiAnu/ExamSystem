/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.UserHistoryDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface UserHistoryService extends SuperService{
    
    //public boolean addUserHistory(UserHistoryDTO userHistoryDTO)throws Exception;
    
    public boolean deleteUserHistory(String UserHistoryId) throws Exception;
    
    public boolean updateUserHistory(UserHistoryDTO userHistoryDTO) throws Exception;
    
    public List<UserHistoryDTO> getAllUserHistorys() throws Exception;
   
    
}
