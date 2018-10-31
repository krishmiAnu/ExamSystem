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
public class ResultDTO extends SuperDTO{
    private String nic;
    private String name;
    private String examCode;
    private String exam;
    private String subject;
    private String marks;
    private String state;

    public ResultDTO() {
    }

    public ResultDTO(String nic, String name, String examCode, String exam, String subject, String marks, String state) {
        this.nic = nic;
        this.name = name;
        this.examCode = examCode;
        this.exam = exam;
        this.subject = subject;
        this.marks = marks;
        this.state = state;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the examCode
     */
    public String getExamCode() {
        return examCode;
    }

    /**
     * @param examCode the examCode to set
     */
    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    /**
     * @return the exam
     */
    public String getExam() {
        return exam;
    }

    /**
     * @param exam the exam to set
     */
    public void setExam(String exam) {
        this.exam = exam;
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
    
}
