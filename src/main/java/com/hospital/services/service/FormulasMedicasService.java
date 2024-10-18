package com.hospital.services.service;

import com.hospital.controller.request.FormulasMedicasRequest;
import com.hospital.controller.response.FormulasMedicasResponse;
import com.hospital.entitys.FormulasMedicas;

import java.util.List;

public interface FormulasMedicasService {
    List<FormulasMedicas> listarFormulasMedicas();
    void guardarFormulasMedicas(FormulasMedicasRequest formulasMedicasRequest);
    void eliminarFormulasMedicas(Long id);
    void actualizarFormulasMedicas(FormulasMedicasRequest formulasMedicasRequest);
    FormulasMedicasResponse consultarFormulasMedicas(Long id);
}
