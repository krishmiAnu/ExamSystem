/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.SubjectService;

/**
 *
 * @author Krishanthi
 */
public class SubjectController {
    public static boolean addSubject(SubjectDTO subject) throws Exception{
        SubjectService subjectService = (SubjectService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);
        return subjectService.addSubject(subject);
    }
    
    public static SubjectDTO serchSubject(SubjectDTO subject) throws Exception{
        SubjectService subjectService = (SubjectService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);
        return subjectService.serch(subject);
    }
    
    public static boolean updateSubject(SubjectDTO subject) throws Exception{
        SubjectService subjectService = (SubjectService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);
        return subjectService.updateSubject(subject);
    }

    public static boolean deleteSubject(String subjectId) throws Exception{
        SubjectService subjectService = (SubjectService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);
        return subjectService.deleteSubject(subjectId);
    }    
    
    public static List<SubjectDTO> getAllSubjects() throws Exception{
        SubjectService subjectService = (SubjectService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);
        return subjectService.getAllSubjects();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECT);
    }
}
