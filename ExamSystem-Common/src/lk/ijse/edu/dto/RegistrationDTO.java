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
public class RegistrationDTO extends SuperDTO{
    private String indexNumber;
    private StudentDTO studentDTO;
    private SubjectDTO subjectDTO;
    private Registration_PKDTO registration_PKDTO;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String indexNumber, StudentDTO studentDTO, SubjectDTO subjectDTO, Registration_PKDTO registration_PKDTO) {
        this.indexNumber = indexNumber;
        this.studentDTO = studentDTO;
        this.subjectDTO = subjectDTO;
        this.registration_PKDTO = registration_PKDTO;
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
     * @return the studentDTO
     */
    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    /**
     * @param studentDTO the studentDTO to set
     */
    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
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
     * @return the registration_PKDTO
     */
    public Registration_PKDTO getRegistration_PKDTO() {
        return registration_PKDTO;
    }

    /**
     * @param registration_PKDTO the registration_PKDTO to set
     */
    public void setRegistration_PKDTO(Registration_PKDTO registration_PKDTO) {
        this.registration_PKDTO = registration_PKDTO;
    }
    
}
