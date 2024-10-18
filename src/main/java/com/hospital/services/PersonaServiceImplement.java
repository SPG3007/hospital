package com.hospital.services;

import com.hospital.controller.request.PersonaRequest;
import com.hospital.controller.response.PersonaResponse;
import com.hospital.controller.response.TipoDocumentoResponse;
import com.hospital.entitys.Personas;
import com.hospital.entitys.TipoDocumento;
import com.hospital.entitys.repositiry.PersonaRepository;
import com.hospital.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PersonaServiceImplement implements PersonaService {

    private final PersonaRepository personaRepository;


    @Override
    public List<Personas> getListPersonas() {
        return personaRepository.listPersonas();
    }

    @Override
    public void deletePerson(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public PersonaResponse searchPerson(Long id) {
        Personas personas = personaRepository.searchPerson(id);
        return Objects.nonNull(personas) ? buildPersonaResponse(personas) : PersonaResponse.builder().build();

    }


    @Override
    public void savePerson(PersonaRequest personaRequest) {
        Personas persona = new Personas();
        TipoDocumento tipoDocumento = new TipoDocumento();
        if (Objects.nonNull(personaRequest)){
            tipoDocumento.setId(personaRequest.getFk_tipo_documento());
            persona.setApellido(personaRequest.getApellido());
            persona.setNombre(personaRequest.getNombre());
            persona.setFk_tipo_documento(tipoDocumento);
            personaRepository.save(persona);
        }

    }

    @Override
    public void updatePerson(PersonaRequest personaRequest) {
        if (Objects.nonNull(personaRequest)){
            Optional<Personas> persona = personaRepository.findById(personaRequest.getId());
          if (persona.isPresent()){
              Personas personaActualizada = buildPersonaEntity(personaRequest);
              personaRepository.save(personaActualizada);
          }else {
              Personas personaGuardar = buildPersonaEntity(personaRequest);
              personaRepository.save(personaGuardar);
          }

        }

    }

    private static Personas buildPersonaEntity(PersonaRequest personaRequest) {
        Personas.builder()
                .id(personaRequest.getId())
                .Nombre(personaRequest.getNombre())
                .Apellido(personaRequest.getApellido())
                .fk_tipo_documento(buildTipoDocumentoEntity(personaRequest))
                .build();
        return null;
    }

    private static TipoDocumento buildTipoDocumentoEntity(PersonaRequest personaRequest) {
        return TipoDocumento.builder()
                .id(personaRequest.getFk_tipo_documento())
                .build();
    }

    private static PersonaResponse buildPersonaResponse(Personas personas) {
        return PersonaResponse.builder()
                .id(personas.getId())
                .nombre(personas.getNombre())
                .apellido(personas.getApellido())
                .tipoDocumentoResponse(buildTipoDocumentoResponse(personas.getFk_tipo_documento()))
                .build();
    }

    private static TipoDocumentoResponse buildTipoDocumentoResponse(Personas personas) {
        return TipoDocumentoResponse.builder()
                .id(personas.getId())
                .siglas(personas.getFk_tipo_documento().getSigla())
                .descripcion(personas.getFk_tipo_documento().getDescripcion())
                .build();
    }
}
