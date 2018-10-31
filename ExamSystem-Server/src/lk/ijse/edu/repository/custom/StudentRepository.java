/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository.custom;

import lk.ijse.edu.entity.Student;
import lk.ijse.edu.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public interface StudentRepository extends SuperRepository<Student, String>{
    public Student getStudentByNIC(String nic,Session session) throws Exception;
}
