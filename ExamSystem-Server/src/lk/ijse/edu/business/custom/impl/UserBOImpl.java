/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.List;
import lk.ijse.edu.business.custom.UserBO;
import lk.ijse.edu.dto.UserDTO;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.UserRepository;

/**
 *
 * @author Krishanthi
 */
public class UserBOImpl implements UserBO{
    
    private UserRepository userRepository;

    public UserBOImpl() {
        this.userRepository = (UserRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.USER);
    }

    @Override
    public boolean addUser(UserDTO userDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUser(UserDTO userDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(String userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserDTO> getAllUsers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
