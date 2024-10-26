package com.ftv.servlets;

import com.ftv.dao.UsuarioDAO;
import com.ftv.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/UsuariosList")
public class MostrarListaUsuariosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.listar();

        String updateUser = req.getParameter("updateUser");
        if(Objects.equals(updateUser, "ok")){
            req.setAttribute("updatedMessage", "Usuario actualizado.");
        }
        req.setAttribute("usuarios", usuarios);
        getServletContext().getRequestDispatcher("/user-list.jsp").forward(req, resp);
    }
}
