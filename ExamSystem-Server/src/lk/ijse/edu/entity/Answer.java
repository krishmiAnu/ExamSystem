/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Krishanthi
 */
@Entity
public class Answer {
  @Id
  private String answerId;
  private String carrectAnswer;
//  @OneToMany(cascade = CascadeType.ALL)
//  @JoinColumn(name="questionId",referencedColumnName = "questionId",insertable = false,updatable = false)
//  private Question question;

    public Answer() {
    }

    public Answer(String answerId, String carrectAnswer) {
        this.answerId = answerId;
        this.carrectAnswer = carrectAnswer;
    }

    /**
     * @return the answerId
     */
    public String getAnswerId() {
        return answerId;
    }

    /**
     * @param answerId the answerId to set
     */
    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    /**
     * @return the carrectAnswer
     */
    public String getCarrectAnswer() {
        return carrectAnswer;
    }

    /**
     * @param carrectAnswer the carrectAnswer to set
     */
    public void setCarrectAnswer(String carrectAnswer) {
        this.carrectAnswer = carrectAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" + "answerId=" + answerId + ", carrectAnswer=" + carrectAnswer + '}';
    }

}
