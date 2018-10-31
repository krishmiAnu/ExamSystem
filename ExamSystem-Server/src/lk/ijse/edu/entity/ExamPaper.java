/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Krishanthi
 */
@Entity
public class ExamPaper {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paperId;
    private String examTitle;
    private int duration;
    private String date;
    private String time;
    private int questionCount;
    @OneToOne(cascade = CascadeType.ALL)
    private Subject subject;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Question> questions;

    public ExamPaper() {
    }

    public ExamPaper(int paperId, String examTitle, Subject subject, int duration, String date, String time, int questionCount) {
        this.paperId = paperId;
        this.examTitle = examTitle;
        this.subject = subject;
        this.duration = duration;
        this.date = date;
        this.time = time;
        this.questionCount = questionCount;
    }

    public ExamPaper(int paperId, String examTitle, int duration, String date, String time, int questionCount, Subject subject, List<Question> questions) {
        this.paperId = paperId;
        this.examTitle = examTitle;
        this.duration = duration;
        this.date = date;
        this.time = time;
        this.questionCount = questionCount;
        this.subject = subject;
        this.questions = questions;
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
     * @return the subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * @return the questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "ExamPaper{" + "paperId=" + paperId + ", examTitle=" + examTitle + ", duration=" + duration + ", date=" + date + ", time=" + time + ", questionCount=" + questionCount + ", subject=" + subject + ", questions=" + questions + '}';
    }

   
}
