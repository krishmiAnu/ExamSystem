/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.business.custom.StudentBO;
import lk.ijse.edu.dto.RegistrationDTO;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.entity.Registration;
import lk.ijse.edu.entity.Student;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.StudentRepository;
import lk.ijse.edu.repository.custom.impl.StudentRepositoryImpl;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class StudentBOImpl implements StudentBO{
    
    private StudentRepository studentRepository;
    private StudentRepositoryImpl studentRepositoryImpl;

    public StudentBOImpl() {
        this.studentRepository = (StudentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.STUDENT);
    }

    @Override
    public boolean addStudent(StudentDTO studentDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            studentRepository.setSession(session);
            
            session.beginTransaction();
            
            Student s = new Student(studentDTO.getStudentId(),
                    studentDTO.getNic(), 
                    studentDTO.getName(), 
                    studentDTO.getMobileNumber(), 
                    studentDTO.getAddress(),
                    studentDTO.getGender(),
                    studentDTO.getEmailAddress(),
                    studentDTO.getUserName(),
                    studentDTO.getPassword()
                    
                    );
            boolean result = studentRepository.save(s);
            
            session.getTransaction().commit();

            return result;
        }
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteStudent(String studentId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentDTO> getAllStudents() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            studentRepository.setSession(session);
            
            session.beginTransaction();

            List<Student> students = studentRepository.findAll();
            
            session.getTransaction().commit();

            if (students != null) {

                List<StudentDTO> alStudents = new ArrayList<>();

                for (Student student : students) {
                    StudentDTO dto = new StudentDTO(student.getStudentId(),
                    student.getNic(), 
                    student.getName(), 
                    student.getMobilNumber(), 
                    student.getAddress(),
                    student.getGender(),
                    student.getEmailAddress(),
                    student.getUserName(),
                    student.getPassword()
                    );
                    alStudents.add(dto);
                }

                return alStudents;

            } else {

                return null;
            }
        }
    }

    @Override
    public StudentDTO search(String nic) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
          session.beginTransaction();
          studentRepository.setSession(session);
          Student student = studentRepository.getStudentByNIC(nic, session);
          session.getTransaction().commit();
          StudentDTO studentDTO1 = new StudentDTO();
          //studentDTO1.setName(student.getName());
          student.getName();
          
          session.close();
          return studentDTO1;
        }
    }
}
 
