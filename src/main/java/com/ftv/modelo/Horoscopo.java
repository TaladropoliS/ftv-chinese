package com.ftv.modelo;

import java.util.Date;

public class Horoscopo {
    private Long id;
    private String animal, url;
    private Date fecha_inicio, fecha_fin;

    public Horoscopo(Long id, String animal, Date fecha_inicio, Date fecha_fin, String url) {
        this.id = id;
        this.animal = animal;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
