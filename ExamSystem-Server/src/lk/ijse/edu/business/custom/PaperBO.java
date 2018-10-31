/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.PaperDTO;

/**
 *
 * @author Krishanthi
 */
public interface PaperBO extends SuperBO{
    
    public boolean addPaper(PaperDTO paper) throws Exception;
    
    public boolean updatePaper(PaperDTO paper) throws Exception;
    
    public boolean deletePaper(String paperId) throws Exception;
    
    public List<PaperDTO> getAllPapers() throws Exception;
    
}
