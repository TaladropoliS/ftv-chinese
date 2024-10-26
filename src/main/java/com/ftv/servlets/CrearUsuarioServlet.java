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

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Optional;

@WebServlet("/CrearUsuario")
public class CrearUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String fecha_nacimientoStr = req.getParameter("fecha_nacimiento");
        String password = req.getParameter("password");

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

        String animal = null;
        if (horoscopo.isPresent()) {
            animal = horoscopo.get().getAnimal();
        }

        Usuario nuevoUsuario = new Usuario(null, nombre, username, email, fecha_nacimientoStr, password, animal);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Boolean respuesta = usuarioDAO.add(nuevoUsuario);

        if (respuesta) {
            req.setAttribute("registerMessage", "Usuario registrado. Ingresa con tus datos.");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al agregar el Usuario");
        }
    }
}
