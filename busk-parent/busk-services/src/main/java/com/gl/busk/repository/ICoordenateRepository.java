package com.gl.busk.repository;

import com.gl.busk.domain.Coordenate;
import java.util.List;

public interface ICoordenateRepository {

    Coordenate saveUpdateCoordenate(Coordenate coordenate);

    List<Coordenate> findCoordenates();
}
