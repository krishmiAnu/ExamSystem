/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.RegistrationDTO;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.RegistrationService;

/**
 *
 * @author Krishanthi
 */
public class RegistrationController {
    public static boolean addRegistration(RegistrationDTO registrationDTO,StudentDTO studentDTO,SubjectDTO subjectDTO) throws Exception{
        RegistrationService registrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return registrationService.addRegistration(registrationDTO,studentDTO,subjectDTO);
    }
    
    public static boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception{
        RegistrationService registrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return registrationService.updateRegistration(registrationDTO);
    }

    public static boolean deleteRegistration(String registrationId) throws Exception{
        RegistrationService registrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return registrationService.deleteRegistration(registrationId);
    }    
    
    public static List<RegistrationDTO> getAllRegistrations() throws Exception{
        RegistrationService registrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return registrationService.getAllRegistrations();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
    }
}
