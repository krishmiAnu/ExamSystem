/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository.custom.impl;

import lk.ijse.edu.entity.Student;
import lk.ijse.edu.repository.SuperRepositoryImpl;
import lk.ijse.edu.repository.custom.StudentRepository;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class StudentRepositoryImpl extends SuperRepositoryImpl<Student, String> implements StudentRepository{
    
    public StudentRepositoryImpl(){
        
    }

    @Override
    public Student getStudentByNIC(String nic,Session session) throws Exception {
        return (Student) session.createQuery("from Student where nic='"+nic+"'");
        
    }
    
}
