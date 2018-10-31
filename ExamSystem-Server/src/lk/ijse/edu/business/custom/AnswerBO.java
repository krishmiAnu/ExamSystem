/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.AnswerDTO;

/**
 *
 * @author Krishanthi
 */
public interface AnswerBO extends SuperBO{
    
    public boolean addAnswer(AnswerDTO answerDTO) throws Exception;
    
    public boolean updateAnswer(AnswerDTO answerDTO) throws Exception;
    
    public boolean deleteAnswer(String answerId) throws Exception;
    
    public List<AnswerDTO> getAllAnswers() throws Exception;
    
}
