/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.StudentService;

/**
 *
 * @author Krishanthi
 */
public class StudentController {
    public static boolean addStudent(StudentDTO studentDTO) throws Exception{
        StudentService studentService = (StudentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
        return studentService.addStudent(studentDTO);
    }
    
    public static boolean updateStudent(StudentDTO studentDTO) throws Exception{
        StudentService studentService = (StudentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
        return studentService.updateStudent(studentDTO);
    }

    public static boolean deleteStudent(String studentId) throws Exception{
        StudentService studentService = (StudentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
        return studentService.deleteStudent(studentId);
    }    
    
    public static List<StudentDTO> getAllStudents() throws Exception{
        StudentService studentService = (StudentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
        return studentService.getAllStudents();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
    }
    
    public static StudentDTO searchStudent(String nic) throws Exception{
        StudentService studentService = (StudentService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
        return studentService.searchStudent(nic);
        
    }
}
