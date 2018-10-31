/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.List;
import lk.ijse.edu.business.custom.UserHistoryBO;
import lk.ijse.edu.dto.UserHistoryDTO;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.UserHistoryRepository;

/**
 *
 * @author Krishanthi
 */
public class UserHistoryBOImpl implements UserHistoryBO{
    
    private UserHistoryRepository userHistoryRepository;

    public UserHistoryBOImpl() {
        this.userHistoryRepository = (UserHistoryRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.USERHISTORY);
    }

    @Override
    public boolean addUserHistory(UserHistoryDTO userHistoryDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUserHistory(UserHistoryDTO userHistoryDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUserHistory(String userHistoryId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserHistoryDTO> getAllUserHistorys() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
