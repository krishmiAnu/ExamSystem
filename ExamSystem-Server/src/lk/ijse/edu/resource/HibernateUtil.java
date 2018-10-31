/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.resource;

import java.io.File;
import java.rmi.registry.Registry;
import lk.ijse.edu.entity.ExamPaper;
import lk.ijse.edu.entity.Question;
import lk.ijse.edu.entity.Registration;
import lk.ijse.edu.entity.Result;
import lk.ijse.edu.entity.Student;
import lk.ijse.edu.entity.Subject;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Krishanthi
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    private static StandardServiceRegistry registry;

    static {
        try {
           // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            File hibernateProperties = new File("settings/hibernateProperties.properties");
            registry = new StandardServiceRegistryBuilder().loadProperties(hibernateProperties).build();

            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Subject.class)
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(Registration.class)
                    .addAnnotatedClass(ExamPaper.class)
                    .addAnnotatedClass(Question.class)
  //S                  .addAnnotatedClass(Registration_PK.class)
//                    .addAnnotatedClass(Answer.class)
                    .addAnnotatedClass(Result.class)
                    //.addAnnotatedClass(User.class)
                    //.addAnnotatedClass(Us)

                    .buildMetadata().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);

            StandardServiceRegistryBuilder.destroy(registry);

            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
