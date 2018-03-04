/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import frontcontroller.FrontCommand;
import model.User;
import persistence.UserDB;


public class RegisterCommand extends FrontCommand {

    @Override
    public void process() {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String birthDate = request.getParameter("birthDate");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        User user = new User(name, lastName, birthDate, email, password);
        
        // Si el usuario no existe lo añadimos a la lista de usuarios
        if(!UserDB.isEmailExist(email)) {
            UserDB.add(user);
            request.setAttribute("message", "Usuario creado correctamente ...");
            forward("/login.jsp");
        }
        else {
            request.setAttribute("error", "El email ya existe");
            forward("/register.jsp");
        }
        
    }
    
}
