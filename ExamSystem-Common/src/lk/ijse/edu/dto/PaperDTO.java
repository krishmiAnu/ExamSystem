/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Krishanthi
 */
public class PaperDTO extends SuperDTO{
    private int paperId;
    private String examTitle;
    private SubjectDTO subjectDTO;
    private int duration;
    private String date;
    private String time;
    private int questionCount;
    private List<QuestionDTO>questionList;

    public PaperDTO() {
    }

    public PaperDTO(int paperId, String examTitle, SubjectDTO subjectDTO, int duration, String date, String time, int questionCount) {
        this.paperId = paperId;
        this.examTitle = examTitle;
        this.subjectDTO = subjectDTO;
        this.duration = duration;
        this.date = date;
        this.time = time;
        this.questionCount = questionCount;
    }

    public PaperDTO(int paperId, String examTitle, SubjectDTO subjectDTO, int duration, String date, String time, int questionCount, List<QuestionDTO> questionList) {
        this.paperId = paperId;
        this.examTitle = examTitle;
        this.subjectDTO = subjectDTO;
        this.duration = duration;
        this.date = date;
        this.time = time;
        this.questionCount = questionCount;
        this.questionList = questionList;
    }
    

    @Override
    public String toString() {
        return "PaperDTO{" + "paperId=" + getPaperId() + ", examTitle=" + getExamTitle() + ", subjectDTO=" + getSubjectDTO() + ", duration=" + getDuration() + ", date=" + getDate() + ", time=" + getTime() + ", questionCount=" + getQuestionCount() + ", questionList=" + getQuestionList() + '}';
    }

    /**
     * @return the paperId
     */
    public int getPaperId() {
        return paperId;
    }

    /**
     * @param paperId the paperId to set
     */
    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    /**
     * @return the examTitle
     */
    public String getExamTitle() {
        return examTitle;
    }

    /**
     * @param examTitle the examTitle to set
     */
    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    /**
     * @return the subjectDTO
     */
    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    /**
     * @param subjectDTO the subjectDTO to set
     */
    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the questionCount
     */
    public int getQuestionCount() {
        return questionCount;
    }

    /**
     * @param questionCount the questionCount to set
     */
    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    /**
     * @return the questionList
     */
    public List<QuestionDTO> getQuestionList() {
        return questionList;
    }

    /**
     * @param questionList the questionList to set
     */
    public void setQuestionList(List<QuestionDTO> questionList) {
        this.questionList = questionList;
    }

    
}
