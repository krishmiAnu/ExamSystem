/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.startup;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.edu.service.impl.ServiceFactoryImpl;
import lk.ijse.edu.resource.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author Krishanthi
 */
public class StartServer {
    
    public static void main(String[] args) {
        try {            
            Registry registry = LocateRegistry.createRegistry(5050);
            registry.rebind("exam", ServiceFactoryImpl.getInstance());
            System.out.println("Server has been started successfully");
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
  
