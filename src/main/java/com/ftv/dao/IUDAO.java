package com.ftv.dao;

import com.ftv.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUDAO<U> {
    List<U> listar();

    Optional<U> byId(Long id);

    Boolean add(Usuario usuario);

    Boolean edit(Usuario usuario);

    Boolean delete(Long id);
}
