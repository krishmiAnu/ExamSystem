/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.UserHistoryDTO;

/**
 *
 * @author Krishanthi
 */
public interface UserHistoryBO extends SuperBO{
    
    public boolean addUserHistory(UserHistoryDTO userHistoryDTO) throws Exception;
    
    public boolean updateUserHistory(UserHistoryDTO userHistoryDTO) throws Exception;
    
    public boolean deleteUserHistory(String userHistoryId) throws Exception;
    
    public List<UserHistoryDTO> getAllUserHistorys() throws Exception;
    
}
