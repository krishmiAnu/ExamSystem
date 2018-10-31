/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.business.custom.SubjectBO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.entity.Subject;
import lk.ijse.edu.repository.RepositoryFactory;
import lk.ijse.edu.repository.custom.SubjectRepository;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Krishanthi
 */
public class SubjectBOImpl implements SubjectBO {

    private SubjectRepository subjectRepository;

    public SubjectBOImpl() {
        this.subjectRepository = (SubjectRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.SUBJECT);
    }

    @Override
    public boolean addSubject(SubjectDTO subject) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            subjectRepository.setSession(session);
            session.beginTransaction();
            Subject s = new Subject(subject.getSubjectId(),subject.getSubjectName());
            boolean result = subjectRepository.save(s);

            session.getTransaction().commit();

            return result;
        }
    }

    @Override
    public boolean updateSubject(SubjectDTO subjectDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteSubject(String subjectId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubjectDTO> getAllSubjects() throws Exception {
            System.out.println("subjectBOIMpl ");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println( "session "+session);
            subjectRepository.setSession(session);
            session.beginTransaction();
            List<Subject> subjects = subjectRepository.findAll();
            session.getTransaction().commit();
//
            List<SubjectDTO> alSubjects = new ArrayList<>();
//
            for (Subject subject : subjects) {
                SubjectDTO dto = new SubjectDTO(subject.getSubjectId(),subject.getSubjectName());
                alSubjects.add(dto);
            }
//
            return alSubjects;
        }
    }

    @Override
    public SubjectDTO search(SubjectDTO subjectDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            subjectRepository.setSession(session);
            session.beginTransaction();
            Subject s = subjectRepository.findById(subjectDTO.getSubjectId());
            session.getTransaction().commit();

            subjectDTO = new SubjectDTO(s.getSubjectId(), s.getSubjectName());
            return subjectDTO;
        }
    }
}
