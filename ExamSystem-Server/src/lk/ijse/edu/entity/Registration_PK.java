/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Krishanthi
 */
@Embeddable
public class Registration_PK implements Serializable{
    //@Column(length = 5)
    private int studentId;
    //@Column(length = 5)
    private int subjectId;

    public Registration_PK() {
    }

    public Registration_PK(int studentId, int subjectId) {
        this.studentId = studentId;
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Registration_PK{" + "studentId" + studentId + ", subjectId=" + subjectId + '}';
    }
    
}
