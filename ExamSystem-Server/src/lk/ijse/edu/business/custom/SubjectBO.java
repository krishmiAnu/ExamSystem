/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom;

import java.util.List;
import lk.ijse.edu.business.SuperBO;
import lk.ijse.edu.dto.SubjectDTO;

/**
 *
 * @author Krishanthi
 */
public interface SubjectBO extends SuperBO{
    
    public boolean addSubject(SubjectDTO subjectDTO) throws Exception;
    public SubjectDTO search(SubjectDTO subjectDTO) throws Exception;
    
    public boolean updateSubject(SubjectDTO subjectDTO) throws Exception;
    
    public boolean deleteSubject(String subjectId) throws Exception;
    
    public List<SubjectDTO> getAllSubjects() throws Exception;
    
}
