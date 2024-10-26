package com.ftv.servlets;

import com.ftv.modelo.Usuario;
import com.ftv.procesaconexion.ConexionBD;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet({"/InicioSesion"})
public class InicioSesionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String u = req.getParameter("username");
        String c = req.getParameter("password");

//        System.out.println("InicioSesionServlet " + u + " " + c);

        String sql = "SELECT * FROM usuarios WHERE username = '" + u + "' AND password = '" + c + "';";

//        System.out.println("sql " + sql);

        try (Statement st = ConexionBD.getInstance().createStatement();
             ResultSet rs = st.executeQuery(sql)
        ) {
            if (rs.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("usuario", rs.getString("username"));
                session.setAttribute("fecha_nac", rs.getString("fecha_nacimiento"));
                session.setAttribute("id", rs.getString("id"));
                resp.sendRedirect(req.getContextPath() + "/index.jsp");
            } else {
                req.setAttribute("errorMessage", "Error, intenta nuevamente");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
//                resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en MySql. No existe el usuario en la BD.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error: " + e.getMessage());
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
