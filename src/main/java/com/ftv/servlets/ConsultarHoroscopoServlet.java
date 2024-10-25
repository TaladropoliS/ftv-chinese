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
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.sql.Date;
import java.util.Optional;

@WebServlet("/GetHoroscopo")
public class ConsultarHoroscopoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fecha_nacimientoStr = req.getParameter("fecha_nacimiento");
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
            req.setAttribute("horoscopo", horoscopo.get());
            getServletContext().getRequestDispatcher("/horoscopo.jsp").forward(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "No se encontró un horóscopo para la fecha proporcionada.");
        }
    }
}
