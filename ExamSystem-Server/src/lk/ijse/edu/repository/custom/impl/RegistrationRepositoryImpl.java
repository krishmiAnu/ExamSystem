/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.repository.custom.impl;

import java.io.Serializable;
import lk.ijse.edu.entity.Registration;
import lk.ijse.edu.repository.SuperRepositoryImpl;
import lk.ijse.edu.repository.custom.RegistrationRepository;

/**
 *
 * @author Krishanthi
 */
public class RegistrationRepositoryImpl extends SuperRepositoryImpl<Registration, String> implements RegistrationRepository{
    
    public RegistrationRepositoryImpl(){
        
    }
    
}
