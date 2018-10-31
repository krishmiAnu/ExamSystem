/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.entity;

import java.awt.print.Paper;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Krishanthi
 */
@Entity
public class Result {
@Id
    private String marks;
    private String state;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="nic",referencedColumnName = "nic",insertable = false,updatable = false)
    private Student student;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="paperId",referencedColumnName = "paperId",insertable = false,updatable = false)
    private ExamPaper examPaper;

    public Result() {
    }

    public Result(String marks, String state, Student student, ExamPaper examPaper) {
        this.marks = marks;
        this.state = state;
        this.student = student;
        this.examPaper = examPaper;
    }

    /**
     * @return the marks
     */
    public String getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the exam
     */
    public ExamPaper getExam() {
        return examPaper;
    }

    /**
     * @param exam the exam to set
     */
    public void setExam(ExamPaper examPaper) {
        this.examPaper = examPaper;
    }

    @Override
    public String toString() {
        return "Result{" + "marks=" + marks + ", state=" + state + ", student=" + student + ", examPaper=" + examPaper + '}';
    }

}