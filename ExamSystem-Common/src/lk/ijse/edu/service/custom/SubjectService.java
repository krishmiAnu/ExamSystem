/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.service.custom;

import java.util.List;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.service.SuperService;

/**
 *
 * @author Krishanthi
 */
public interface SubjectService extends SuperService{
    
    public boolean addSubject(SubjectDTO subjectDTO)throws Exception;
    
    
    public SubjectDTO serch(SubjectDTO subjectDTO)throws Exception;
    
    public boolean deleteSubject(String SubjectId) throws Exception;
    
    public boolean updateSubject(SubjectDTO subjectDTO) throws Exception;
    
    public List<SubjectDTO> getAllSubjects() throws Exception;
    
}
