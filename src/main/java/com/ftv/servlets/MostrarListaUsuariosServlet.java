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

@WebServlet("/UsuariosList")
public class MostrarListaUsuariosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.listar();

//        System.out.println("Número de usuarios obtenidos: " + usuarios.size());

        req.setAttribute("usuarios", usuarios);

//        req.setAttribute("mensaje", "Prueba de paso de datos al JSP");

        getServletContext().getRequestDispatcher("/user-list.jsp").forward(req, resp);
    }
}
