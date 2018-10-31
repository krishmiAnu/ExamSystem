/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.UserDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface UserService extends SuperService{
    
    //public boolean addUser(UserDTO userDTO)throws Exception;
    
    public boolean deleteUser(String UserId) throws Exception;
    
    public boolean updateUser(UserDTO userDTO) throws Exception;
    
    public List<UserDTO> getAllUsers() throws Exception;
    
}
