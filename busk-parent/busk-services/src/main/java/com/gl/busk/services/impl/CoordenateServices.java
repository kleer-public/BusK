package com.gl.busk.services.impl;

import com.gl.busk.domain.Coordenate;
import com.gl.busk.repository.ICoordenateRepository;
import com.gl.busk.services.ICoordenateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CoordenateServices implements ICoordenateServices {

    @Autowired
    ICoordenateRepository repository;

    @Override
    public Coordenate saveUpdateCoordenate(Coordenate coordenate) {
        return repository.saveUpdateCoordenate(coordenate);
    }

    @Override
    public List<Coordenate> findCoordenates() {
        return repository.findCoordenates();
    }
}
