/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.PaperDTO;

/**
 *
 * @author Krishanthi
 */
public interface ManageQuestionBO extends SuperBO{
    
    public boolean addManageQuestion(QuestionDTO manageQuestionDTO,PaperDTO paperDTO) throws Exception;
    
    public boolean updateManageQuestion(QuestionDTO manageQuestionDTO) throws Exception;
    
    public boolean deleteManageQuestion(String ManageQuestionId) throws Exception;
    
    public List<QuestionDTO> getAllManageQuestions() throws Exception;
    
    public QuestionDTO search(String id)throws Exception;
    
}
