/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.AnswerDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface AnswerService extends SuperService{
    
    public boolean addAnswer(AnswerDTO answerDTO)throws Exception;
    
    public boolean deleteAnswer(String answerId) throws Exception;
    
    public boolean updateAnswer(AnswerDTO answerDTO) throws Exception;
    
    public List<AnswerDTO> getAllAnswers() throws Exception;
    
}
