/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Krishanthi
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String nic;
    private String name;
    private String mobilNumber;
    private String address;
    private String gender;
    private String emailAddress;
    private String userName;
    private String password;

    public Student() {
    }

    public Student(int studentId, String nic, String name, String mobilNumber, String address, String gender, String emailAddress, String userName, String password) {
        this.studentId = studentId;
        this.nic = nic;
        this.name = name;
        this.mobilNumber = mobilNumber;
        this.address = address;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
     * @return the mobilNumber
     */
    public String getMobilNumber() {
        return mobilNumber;
    }

    /**
     * @param mobilNumber the mobilNumber to set
     */
    public void setMobilNumber(String mobilNumber) {
        this.mobilNumber = mobilNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", nic=" + nic + ", name=" + name + ", mobilNumber=" + mobilNumber + ", address=" + address + ", gender=" + gender + ", emailAddress=" + emailAddress + ", userName=" + userName + ", password=" + password + '}';
    }

}
