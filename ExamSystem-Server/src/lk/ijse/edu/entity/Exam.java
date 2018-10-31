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
public class Exam {
   @Id
   private String examId;
   private String examTitle;
   private String duration;
   private String date;
   private String time;
   private int questionCount;
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="subjectId",referencedColumnName = "subjectId",insertable = false,updatable = false)
   private Subject subject;
   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name="questionId",referencedColumnName = "questionId",insertable = false,updatable = false)
   private Question question;

    public Exam() {
    }

    public Exam(String examId, String examTitle, String date, String time, Subject subject) {
        this.examId = examId;
        this.examTitle = examTitle;
        this.date = date;
        this.time = time;
        this.subject = subject;
    }

    /**
     * @return the examId
     */
    public String getExamId() {
        return examId;
    }

    /**
     * @param examId the examId to set
     */
    public void setExamId(String examId) {
        this.examId = examId;
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

    @Override
    public String toString() {
        return "Exam{" + "examId=" + examId + ", examTitle=" + examTitle + ", date=" + date + ", time=" + time + ", subject=" + subject + '}';
    }

}
