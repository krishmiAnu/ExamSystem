/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.ResultDTO;

/**
 *
 * @author Krishanthi
 */
public interface ResultBO extends SuperBO{
    
    public boolean addResult(ResultDTO resultDTO) throws Exception;
    
    public boolean updateResult(ResultDTO resultDTO) throws Exception;
    
    public boolean deleteResult(String resultId) throws Exception;
    
    public List<ResultDTO> getAllResults() throws Exception;
    
    
}
