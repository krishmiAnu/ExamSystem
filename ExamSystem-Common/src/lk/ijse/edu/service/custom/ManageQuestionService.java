/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface ManageQuestionService extends SuperService{
    
    public boolean addManageQuestion(QuestionDTO manageQuestionDTO,PaperDTO paperDTO)throws Exception;
    
    public boolean deleteManageQuestion(String manageQuestionId) throws Exception;
    
    public boolean updateManageQuestion(QuestionDTO manageQuestionDTO) throws Exception;
    
    public List<QuestionDTO> getAllManageQuestions() throws Exception;
    
    public QuestionDTO searchQuestion(String id) throws Exception;
}
