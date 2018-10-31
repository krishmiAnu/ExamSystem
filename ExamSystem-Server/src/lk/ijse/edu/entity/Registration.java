/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.dto.SubjectDTO;

/**
 *
 * @author Krishanthi
 */
@Entity
public class Registration implements Serializable{

    @Id
    private String indexNumber;
//    private String subject;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "studentId", referencedColumnName = "studentId", insertable = false, updatable = false)
   @OneToOne(cascade = CascadeType.ALL)
    private Student student;
//    @JoinColumn(name = "subjectId", referencedColumnName = "subjectId", insertable = false, updatable = false)
   @OneToOne(cascade = CascadeType.ALL)
    private Subject subject;
//    @EmbeddedId
//    private Registration_PK registration_PK;

    public Registration() {
    }

    public Registration(String indexNumber, Student student, Subject subject) {
        this.indexNumber = indexNumber;
        this.student = student;
        this.subject = subject;
    }

    /**
     * @return the indexNumber
     */
    public String getIndexNumber() {
        return indexNumber;
    }

    /**
     * @param indexNumber the indexNumber to set
     */
    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
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
        return "Registration{" + "indexNumber=" + indexNumber + ", student=" + student + ", subject=" + subject + '}';
    }
    
}
