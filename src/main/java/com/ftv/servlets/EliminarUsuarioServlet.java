package com.ftv.servlets;

import com.ftv.dao.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/EliminarUsuario")
public class EliminarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String id = req.getParameter("id");
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Boolean respuesta = usuarioDAO.delete(Long.parseLong(id));
        if(respuesta){
            resp.sendRedirect("/ftv-chinese/CerrarSesion?deletedUser=ok");
        }else {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al eliminar el Usuario");
        }
    }
}
