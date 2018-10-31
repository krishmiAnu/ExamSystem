/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface StudentService extends SuperService{
    
    public boolean addStudent(StudentDTO studentDTO)throws Exception;
    
    public boolean deleteStudent(String StudentId) throws Exception;
    
    public boolean updateStudent(StudentDTO studentDTO) throws Exception;
    
    public List<StudentDTO> getAllStudents() throws Exception;
    
    public StudentDTO searchStudent(String nic) throws Exception;

}
