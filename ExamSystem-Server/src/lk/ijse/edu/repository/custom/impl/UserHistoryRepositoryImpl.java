/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository.custom.impl;

import lk.ijse.edu.entity.Student;
import lk.ijse.edu.repository.SuperRepositoryImpl;
import lk.ijse.edu.repository.custom.UserHistoryRepository;

/**
 *
 * @author Krishanthi
 */
public class UserHistoryRepositoryImpl extends SuperRepositoryImpl<Student, String> implements UserHistoryRepository{
    
    public UserHistoryRepositoryImpl(){
        
    }
    
}
