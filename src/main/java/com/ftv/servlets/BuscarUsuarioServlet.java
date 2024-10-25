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

@WebServlet("/GetUsuario")
public class BuscarUsuarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Optional<Usuario> usuario = usuarioDAO.byId(Long.parseLong(id));

        if (usuario.isPresent()) {
            req.setAttribute("usuario", usuario.get());
            getServletContext().getRequestDispatcher("/user-edit.jsp").forward(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al editar el Usuario");
        }
    }
}
