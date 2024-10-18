package com.hospital.services;

import com.hospital.controller.request.TipoDocumentoRequest;
import com.hospital.controller.response.TipoDocumentoResponse;
import com.hospital.entitys.TipoDocumento;
import com.hospital.entitys.repositiry.TipoDocumentoRepository;
import com.hospital.services.service.TipoDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class TipoDocumentosServiceImplement implements TipoDocumentoService {
    private final TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<TipoDocumento> listarTipoDocumentos() {
        return tipoDocumentoRepository.listDocumentType();
    }

    @Override
    public void guardarTipoDocumentos(TipoDocumentoRequest tipoDocumentoRequest) {
        if (Objects.nonNull(tipoDocumentoRequest)) {
            TipoDocumento tipoDocumento = TipoDocumento.builder()
                    .sigla(tipoDocumentoRequest.getSiglas())
                    .descripcion(tipoDocumentoRequest.getDescripcion())
                    .build();
            tipoDocumentoRepository.save(tipoDocumento);
        }
    }

    @Override
    public void eliminarTipoDocumentos(Long id) {
        tipoDocumentoRepository.deleteById(id);
    }

    @Override
    public void actualizarTipoDocumentos(TipoDocumentoRequest tipoDocumentoRequest) {
        if (Objects.nonNull(tipoDocumentoRequest)) {
            TipoDocumento tipoDocumento = TipoDocumento.builder()
                    .sigla(tipoDocumentoRequest.getSiglas())
                    .descripcion(tipoDocumentoRequest.getDescripcion())
                    .build();
            tipoDocumentoRepository.save(tipoDocumento);
        }
    }

    @Override
    public TipoDocumentoResponse consultarTipoDocumentos(Long id) {
        TipoDocumento tipoDocumento = tipoDocumentoRepository.searchTipoDocumento(id);
        if (Objects.nonNull(tipoDocumento)) {
            return TipoDocumentoResponse.builder()
                    .id(tipoDocumento.getId())
                    .siglas(tipoDocumento.getSigla())
                    .descripcion(tipoDocumento.getDescripcion())
                    .build();
        }
        return TipoDocumentoResponse.builder().build();
    }
}
