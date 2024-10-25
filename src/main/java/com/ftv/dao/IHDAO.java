package com.ftv.dao;

import com.ftv.modelo.Horoscopo;

import java.util.Date;
import java.util.List;

public interface IHDAO<H> {

    H byDate(Date fecha_nacimiento);

}
