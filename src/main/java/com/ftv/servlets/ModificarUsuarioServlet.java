package com.ftv.servlets;

import com.ftv.dao.HoroscopoDAO;
import com.ftv.dao.UsuarioDAO;
import com.ftv.modelo.Horoscopo;
import com.ftv.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Optional;

@WebServlet("/ModificarUsuario")
public class ModificarUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String fecha_nacimientoStr = req.getParameter("fecha_nacimiento");
        String password = req.getParameter("password");
        String animal = req.getParameter("animal");

        LocalDate fecha_nacimiento = null;
        try {
            fecha_nacimiento = LocalDate.parse(fecha_nacimientoStr);
        } catch (DateTimeParseException e) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Formato de fecha inválido. Usa el formato YYYY-MM-DD.");
            return;
        }
        Date sqlFechaNacimiento = Date.valueOf(fecha_nacimiento);
        HoroscopoDAO horoscopoDAO = new HoroscopoDAO();
        Optional<Horoscopo> horoscopo = horoscopoDAO.byDate(sqlFechaNacimiento);
        if (horoscopo.isPresent()) {
            animal = horoscopo.get().getAnimal();
        }

        Usuario usuario = new Usuario(id, nombre, username, email, fecha_nacimientoStr, password, animal);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Boolean respuesta = usuarioDAO.edit(usuario);

        HttpSession session = req.getSession();
        session.setAttribute("usuario", username);
        session.setAttribute("fecha_nac", fecha_nacimientoStr);

        if (respuesta) {
            resp.sendRedirect("/ftv-chinese/UsuariosList?updateUser=ok");
        } else {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al editar el Usuario");
        }
    }
}

