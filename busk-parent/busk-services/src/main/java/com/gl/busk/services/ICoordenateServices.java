package com.gl.busk.services;

import com.gl.busk.domain.Coordenate;

import java.util.List;

public interface ICoordenateServices {

    Coordenate saveUpdateCoordenate(Coordenate coordenate);

    List<Coordenate> findCoordenates();
}
