/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface PaperService extends SuperService{
    
    public boolean addPaper(PaperDTO paper)throws Exception;
    
    public boolean deletePaper(String paperId) throws Exception;
    
    public boolean updatePaper(PaperDTO paper) throws Exception;
    
    public List<PaperDTO> getAllPapers() throws Exception;
    
    public PaperDTO searchPaper(String title, String subject) throws Exception;
}
