/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.ResultDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface ResultService extends SuperService{
    
    public boolean addResult(ResultDTO resultDTO)throws Exception;
    
    public boolean deleteResult(String resultId) throws Exception;
    
    public boolean updateResult(ResultDTO resultDTO) throws Exception;
    
    public List<ResultDTO> getAllResults() throws Exception;
    
}
