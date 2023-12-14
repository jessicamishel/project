/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.List;
import org.proyecto.dto.ProcesoDto;
import org.proyecto.entity.Proceso;
import org.proyecto.mappers.ProcesoMapper;
import org.proyecto.repository.ProcesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jmish
 */
@Service
public class ProcesoService {
    @Autowired
    private ProcesoRepository repository;
    @Autowired
    private ProcesoMapper mapper;

    public List<ProcesoDto> consultarProceso() {
        List<Proceso> proceso = repository.findAll();
        return mapper.toDto(proceso);
    }
}
