package com.hospital.services.service;

import com.hospital.controller.request.TipoDocumentoRequest;
import com.hospital.controller.response.TipoDocumentoResponse;
import com.hospital.entitys.TipoDocumento;

import java.util.List;

public interface TipoDocumentoService {
    List<TipoDocumento> listarTipoDocumentos();
    void guardarTipoDocumentos(TipoDocumentoRequest tipoDocumentoRequest);
    void eliminarTipoDocumentos(Long id);
    void actualizarTipoDocumentos(TipoDocumentoRequest tipoDocumentoRequest);
    TipoDocumentoResponse consultarTipoDocumentos(Long id);
}
