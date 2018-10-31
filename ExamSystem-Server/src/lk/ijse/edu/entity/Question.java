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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Krishanthi
 */
@Entity
public class Question {
   @Id
   private String questionId;
   private String question;
   private String subject;
   private String answer1;
   private String answer2;
   private String answer3;
   private String answer4;
   private String date;
   private String carrectAnswer;
//   @ManyToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name = "paperId", referencedColumnName = "paperId", insertable = false, updatable = false)
   @ManyToOne(cascade = CascadeType.ALL)
   private ExamPaper examPaper;
//   @OneToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name = "answerId", referencedColumnName = "answerId", insertable = false, updatable = false)
//   private Answer carrectAnswer;

    public Question() {
    }

    public Question(String questionId, String question, String subject, String answer1, String answer2, String answer3, String answer4, String date, String carrectAnswer, ExamPaper examPaper) {
        this.questionId = questionId;
        this.question = question;
        this.subject = subject;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.date = date;
        this.carrectAnswer = carrectAnswer;
        this.examPaper = examPaper;
    }

    /**
     * @return the questionId
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId the questionId to set
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the answer1
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * @param answer1 the answer1 to set
     */
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    /**
     * @return the answer2
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * @param answer2 the answer2 to set
     */
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    /**
     * @return the answer3
     */
    public String getAnswer3() {
        return answer3;
    }

    /**
     * @param answer3 the answer3 to set
     */
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    /**
     * @return the answer4
     */
    public String getAnswer4() {
        return answer4;
    }

    /**
     * @param answer4 the answer4 to set
     */
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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

    /**
     * @return the examPaper
     */
    public ExamPaper getExamPaper() {
        return examPaper;
    }

    /**
     * @param examPaper the examPaper to set
     */
    public void setExamPaper(ExamPaper examPaper) {
        this.examPaper = examPaper;
    }

    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", question=" + question + ", subject=" + subject + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", date=" + date + ", carrectAnswer=" + carrectAnswer + ", examPaper=" + examPaper + '}';
    }
    
    
}