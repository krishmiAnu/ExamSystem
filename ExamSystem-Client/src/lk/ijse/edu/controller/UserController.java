/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.controller;

import java.util.List;
import lk.ijse.edu.dto.UserDTO;
import lk.ijse.edu.observer.Subject;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;
import lk.ijse.edu.service.custom.UserService;

/**
 *
 * @author Krishanthi
 */
public class UserController {
//    public static boolean addUser(UserDTO userDTO) throws Exception{
//        UserService userService = (UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
//        return userService.addUser(userDTO);
//    }
    
    public static boolean updateUser(UserDTO userDTO) throws Exception{
        UserService userService = (UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
        return userService.updateUser(userDTO);
    }

    public static boolean deleteUser(String userId) throws Exception{
        UserService userService = (UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
        return userService.deleteUser(userId);
    }    
    
    public static List<UserDTO> getAllUsers() throws Exception{
        UserService userService = (UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
        return userService.getAllUsers();
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
    }
}
