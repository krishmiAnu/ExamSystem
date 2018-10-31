/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.RegistrationDTO;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.dto.SubjectDTO;

/**
 *
 * @author Krishanthi
 */
public interface RegistrationBO extends SuperBO{
    
    public boolean addRegistration(RegistrationDTO registrationDTO,StudentDTO studentDTO,SubjectDTO subjectDTO) throws Exception;
    
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception;
    
    public boolean deleteRegistration(String registrationId) throws Exception;
    
    public List<RegistrationDTO> getAllRegistrations() throws Exception;
    
}
