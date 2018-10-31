/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.business.custom.RegistrationBO;
import lk.ijse.edu.dto.RegistrationDTO;
import lk.ijse.edu.dto.StudentDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.entity.Registration;
import lk.ijse.edu.entity.Registration_PK;
import lk.ijse.edu.entity.Student;
import lk.ijse.edu.entity.Subject;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.RegistrationRepository;
import lk.ijse.edu.repository.custom.StudentRepository;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Krishanthi
 */
public class RegistrationBOImpl implements RegistrationBO {

    private RegistrationRepository registrationRepository;
    private StudentRepository studentRepository;

    public RegistrationBOImpl() {
        this.registrationRepository = (RegistrationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.REGISTRATION);
        this.studentRepository = (StudentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.STUDENT);
    }

//    @Override
//    public boolean addRegistration(RegistrationDTO registrationDTO) throws Exception {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//
//            registrationRepository.setSession(session);
//            studentRepository.setSession(session);
//
//            session.beginTransaction();
//
////                Student s = new Student();
////                s.setNic(registrationDTO.getStudentDTO().getNic());
////                s.setName(registrationDTO.getStudentDTO().getName());
////                s.setMobilNumber(registrationDTO.getStudentDTO().getMobileNumber());
////                s.setAddress(registrationDTO.getStudentDTO().getAddress());
////                s.setGender(registrationDTO.getStudentDTO().getGender());
////                s.setEmailAddress(registrationDTO.getStudentDTO().getEmailAddress());
////                s.setUserName(registrationDTO.getStudentDTO().getUserName());
////                s.setPassword(registrationDTO.getStudentDTO().getPassword());
////                System.out.println("trance stu done");
//            Registration r = new Registration();
//            r.setIndexNumber(registrationDTO.getIndexNumber());
//
//            StudentDTO sdto = registrationDTO.getStudentDTO();
//            Student student = new Student();
//            student.setNic(sdto.getNic());
//            student.setName(sdto.getName());
//            student.setMobilNumber(sdto.getMobileNumber());
//            student.setAddress(sdto.getAddress());
//            student.setGender(sdto.getGender());
//            student.setEmailAddress(sdto.getEmailAddress());
//            student.setUserName(sdto.getUserName());
//            student.setPassword(sdto.getPassword());
//
////            Subject su = new Subject();
////            su.setSubjectName(registrationDTO.getSubjectDTO().getSubjectName());
//                //su.setSubjectName(su);
//
//            r.setStudent(student);
//            //r.setSubject(su);
//            
//            boolean result2 = registrationRepository.save(r);
//            boolean result1 = studentRepository.save(student);
//            
//
//            session.getTransaction().commit();
//            if (result2 && result1) {
//
//            }
//            return true;
//        }
//    }
    @Override
    public boolean updateRegistration(RegistrationDTO registration) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteRegistration(String registrationId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistrationDTO> getAllRegistrations() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            registrationRepository.setSession(session);

            session.beginTransaction();

            List<Registration> ragistrations = registrationRepository.findAll();

            session.getTransaction().commit();

            if (ragistrations != null) {

                List<RegistrationDTO> alRegistrations = new ArrayList<>();

                for (Registration registration : ragistrations) {
                    Student s = new Student();
//                    s.setNic(registration.getStudent().getNic());
//                    s.setName(registration.getStudent().getName());
//                    s.setMobilNumber(registration.getStudent().getMobilNumber());
//                    s.setAddress(registration.getStudent().getAddress());
//                    s.setGender(registration.getStudent().getGender());
//                    s.setEmailAddress(registration.getStudent().getEmailAddress());
//                    s.setUserName(registration.getStudent().getUserName());
//                    s.setPassword(registration.getStudent().getPassword());

                    //Subject su = new Subject();
                    //su.setSubjectName(registration.getSubject().getSubjectName());
                    Registration r = new Registration();
                    r.setIndexNumber(registration.getIndexNumber());
                    //alRegistrations.add(registration);
                }

                return alRegistrations;

            } else {

                return null;
            }
        }
    }

    @Override
    public boolean addRegistration(RegistrationDTO registrationDTO, StudentDTO studentDTO, SubjectDTO subjectDTO) throws Exception {
        Student student = new Student(
                studentDTO.getStudentId(),
                studentDTO.getNic(),
                studentDTO.getName(),
                studentDTO.getMobileNumber(),
                studentDTO.getAddress(),
                studentDTO.getGender(),
                studentDTO.getEmailAddress(),
                studentDTO.getUserName(),
                studentDTO.getPassword()
        );

        Subject subject = new Subject(
                subjectDTO.getSubjectId(),
                subjectDTO.getSubjectName()
        );
//        Registration_PK registration_PK = new Registration_PK(
//                student.getStudentId(),
//                subject.getSubjectId()
//        );
        Registration registration = new Registration(
                registrationDTO.getIndexNumber(),
                student,
                subject
        );

        System.out.println("registration -> " + registration);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            registrationRepository.setSession(session);
            studentRepository.setSession(session);
            session.beginTransaction();
            boolean saveStudent = studentRepository.save(student);
            if(saveStudent){
                boolean result = registrationRepository.save(registration);
                session.getTransaction().commit();
                return result;
            } else {
                session.getTransaction().rollback();
                return false;
            }
        }
    }
}
