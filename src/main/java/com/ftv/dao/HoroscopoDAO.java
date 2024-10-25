package com.ftv.dao;

import com.ftv.modelo.Horoscopo;
import com.ftv.modelo.Usuario;
import com.ftv.procesaconexion.ConexionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Optional;

public class HoroscopoDAO implements IHDAO {

    private Connection conectar() throws SQLException, ClassNotFoundException {
        return ConexionBD.getInstance();
    }

    @Override
    public Optional<Horoscopo> byDate(Date fecha) {
        Optional<Horoscopo> optionalHoroscopo = Optional.empty();
        String sql = "SELECT * FROM horoscopo WHERE '" + fecha + "' BETWEEN fecha_inicio AND fecha_fin;";

        System.out.println("sql Horoscopo ByDate " + sql);

        try (Statement st = conectar().createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                optionalHoroscopo = Optional.of(new Horoscopo(
                        rs.getLong("id"),
                        rs.getString("animal"),
                        rs.getDate("fecha_inicio"),
                        rs.getDate("fecha_fin"),
                        rs.getString("url")
                ));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return optionalHoroscopo;
    }
}
