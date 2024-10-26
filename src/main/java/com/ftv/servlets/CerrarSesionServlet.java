package com.ftv.servlets;

import com.ftv.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@WebServlet("/CerrarSesion")
public class CerrarSesionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Optional<String> optionalUsuario = Usuario.getUsuario(req);
        if (optionalUsuario.isPresent()) {
            HttpSession session = req.getSession();
            session.invalidate();
        }
        String deletedUser = req.getParameter("deletedUser");
        System.out.println("deletedUser: " + deletedUser);
        if(Objects.equals(deletedUser, "ok")){
            req.setAttribute("deletedMessage", "Usuario eliminado.");
        }
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }
}
