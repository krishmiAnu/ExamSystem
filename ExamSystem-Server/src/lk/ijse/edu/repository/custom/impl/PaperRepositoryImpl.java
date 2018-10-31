/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository.custom.impl;

import java.io.Serializable;
import lk.ijse.edu.entity.ExamPaper;
import lk.ijse.edu.repository.SuperRepositoryImpl;
import lk.ijse.edu.repository.custom.PaperRepository;

/**
 *
 * @author Krishanthi
 */
public class PaperRepositoryImpl extends SuperRepositoryImpl<ExamPaper, String> implements PaperRepository{
    
    public PaperRepositoryImpl(){
        
    }
    
}
