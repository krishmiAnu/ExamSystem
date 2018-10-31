/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.UserDTO;

/**
 *
 * @author Krishanthi
 */
public interface UserBO extends SuperBO{
    
    public boolean addUser(UserDTO userDTO) throws Exception;
    
    public boolean updateUser(UserDTO userDTO) throws Exception;
    
    public boolean deleteUser(String userId) throws Exception;
    
    public List<UserDTO> getAllUsers() throws Exception;
    
}
