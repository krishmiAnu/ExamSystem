/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.dto;

/**
 *
 * @author Krishanthi
 */
public class AnswerDTO extends SuperDTO{
    private String answerID;
    private String answer;

    public AnswerDTO() {
    }

    public AnswerDTO(String answerID, String answer) {
        this.answerID = answerID;
        this.answer = answer;
    }

    /**
     * @return the answerID
     */
    public String getAnswerID() {
        return answerID;
    }

    /**
     * @param answerID the answerID to set
     */
    public void setAnswerID(String answerID) {
        this.answerID = answerID;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
