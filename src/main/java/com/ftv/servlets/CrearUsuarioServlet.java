package com.ftv.servlets;

import com.ftv.dao.UsuarioDAO;
import com.ftv.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/CrearUsuario")
public class CrearUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String fecha_nacimiento = req.getParameter("fecha_nacimiento");
        String password = req.getParameter("password");
        String animal = req.getParameter("animal");

        Usuario nuevoUsuario = new Usuario(null, nombre, username, email, fecha_nacimiento, password, animal);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Boolean respuesta = usuarioDAO.add(nuevoUsuario);

        if(respuesta){
            resp.sendRedirect("/ftv-chinese/Usuarios");
        }else{
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al agregar el Usuario");
        }
    }
}
