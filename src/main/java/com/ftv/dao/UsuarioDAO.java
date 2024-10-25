package com.ftv.dao;

import com.ftv.modelo.Usuario;
import com.ftv.procesaconexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioDAO implements IUDAO {

    private Connection conectar() throws SQLException, ClassNotFoundException {
        return ConexionBD.getInstance();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios ORDER BY nombre DESC;";
        try (Statement st = conectar().createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Usuario u = new Usuario(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("fecha_nacimiento"),
                        rs.getString("password"),
                        rs.getString("animal"));
                usuarios.add(u);
            }

//            System.out.println("Usuarios obtenidos: " + usuarios.size());

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public Optional<Usuario> byId(Long id) {
        Optional<Usuario> optionalUsuario = Optional.empty();
        String sql = "SELECT * FROM usuarios WHERE id = " + id + ";";

        try (Statement st = conectar().createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                optionalUsuario = Optional.of(new Usuario(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("fecha_nacimiento"),
                        rs.getString("password"),
                        rs.getString("animal")
                ));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return optionalUsuario;
    }

    @Override
    public Boolean add(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, username, email, fecha_nacimiento, password, animal) " +
                "VALUES ('" + usuario.getNombre() + "', '" +
                usuario.getUsername() + "', '" +
                usuario.getEmail() + "', '" +
                usuario.getFecha_nacimiento() + "', '" +
                usuario.getPassword() + "', '" +
                usuario.getAnimal() + "');";


        try (Statement st = conectar().createStatement()) {
            st.execute(sql);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean edit(Usuario usuario) {

        System.out.println("password" + usuario.getPassword());
        System.out.println("usuario" + usuario.getFecha_nacimiento());

        String sql = "UPDATE usuarios SET nombre = '" + usuario.getNombre() +
                "', username = '" + usuario.getUsername() + "'," +
                "email = '" + usuario.getEmail() + "'," +
                "fecha_nacimiento = '" + usuario.getFecha_nacimiento() + "'," +
                "password = '" + usuario.getPassword() + "'," +
                "animal = '" + usuario.getAnimal() +
                "' WHERE id = " + usuario.getId();

        System.out.println("sql" + sql);

        try (Statement st = conectar().createStatement()) {
            st.execute(sql);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public Boolean delete(Long id) {
        String sql = "DELETE FROM USUARIOS WHERE id =" + id;
        try (Statement st = conectar().createStatement()) {
            st.execute(sql);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
