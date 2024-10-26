package com.ftv.servlets;

import com.ftv.dao.UsuarioDAO;
import com.ftv.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/ModificarUsuario")
public class ModificarUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String fecha_nacimiento = req.getParameter("fecha_nacimiento");
        String password = req.getParameter("password");
        String animal = req.getParameter("animal");

//        System.out.println(
//                Long.parseLong(req.getParameter("id")) + " " +
//                        req.getParameter("nombre") + " " +
//                        req.getParameter("username") + " " +
//                        req.getParameter("email") + " " +
//                        req.getParameter("fecha_nacimiento") + " " +
//                        req.getParameter("password") + " " +
//                        req.getParameter("animal")
//        );

        Usuario usuario = new Usuario(id, nombre, username, email, fecha_nacimiento, password, animal);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Boolean respuesta = usuarioDAO.edit(usuario);

        if (respuesta) {
            resp.sendRedirect("/ftv-chinese/UsuariosList");
        } else {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al editar el Usuario");
        }
    }
}

