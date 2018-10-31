/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.StudentDTO;

/**
 *
 * @author Krishanthi
 */
public interface StudentBO extends SuperBO{
    
    public boolean addStudent(StudentDTO studentDTO) throws Exception;
    
    public boolean updateStudent(StudentDTO studentDTO) throws Exception;
    
    public boolean deleteStudent(String studentId) throws Exception;
    
    public List<StudentDTO> getAllStudents() throws Exception;
    
    public StudentDTO search(String nic)throws Exception;
}
