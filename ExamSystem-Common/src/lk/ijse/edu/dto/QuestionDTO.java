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
public class QuestionDTO extends SuperDTO{
    private String questionID;
    private String subject;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String date;
    private String carrectAnswer;
    private PaperDTO paperDTO;

    public QuestionDTO() {
    }

    public QuestionDTO(String questionID, String subject, String question, String answer1, String answer2, String answer3, String answer4, String date, String carrectAnswer) {
        this.questionID = questionID;
        this.subject = subject;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.date = date;
        this.carrectAnswer = carrectAnswer;
    }

    public QuestionDTO(String questionID, String subject, String question, String answer1, String answer2, String answer3, String answer4, String date, String carrectAnswer, PaperDTO paperDTO) {
        this.questionID = questionID;
        this.subject = subject;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.date = date;
        this.carrectAnswer = carrectAnswer;
        this.paperDTO = paperDTO;
    }

    /**
     * @return the questionID
     */
    public String getQuestionID() {
        return questionID;
    }

    /**
     * @param questionID the questionID to set
     */
    public void setQuestionID(String questionID) {
        this.questionID = questionID;
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
     * @return the paperDTO
     */
    public PaperDTO getPaperDTO() {
        return paperDTO;
    }

    /**
     * @param paperDTO the paperDTO to set
     */
    public void setPaperDTO(PaperDTO paperDTO) {
        this.paperDTO = paperDTO;
    }

}