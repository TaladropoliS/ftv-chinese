package com.ftv.dao;

import com.ftv.modelo.Horoscopo;

import java.util.List;

public interface IHDAO<H> {

    List<H> Listar();

    H byId(Long id);

    Boolean add(Horoscopo horoscopo);

    Boolean edit(Long id);

    Boolean delete(Horoscopo horoscopo);
}
