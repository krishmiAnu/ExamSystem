/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.RegistrationDTO;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface RegistrationService extends SuperService{
    
    public boolean addRegistration(RegistrationDTO registrationDTO,StudentDTO studentDTO,SubjectDTO subjectDTO)throws Exception;
    
    public boolean deleteRegistration(String registrationId) throws Exception;
    
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception;
    
    public List<RegistrationDTO> getAllRegistrations() throws Exception;
    
}
