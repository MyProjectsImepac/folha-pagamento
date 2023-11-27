package br.edu.imepac.folhapagamento.services;

import br.edu.imepac.folhapagamento.domains.cordinator.CordinatorCreateRequest;
import br.edu.imepac.folhapagamento.domains.cordinator.CordinatorDTO;
import br.edu.imepac.folhapagamento.entities.Cordinator;
import br.edu.imepac.folhapagamento.repositories.CordinatorRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
public class CordinatorService {

    private final CordinatorRepository cordinatorRepository;
    private final ModelMapper modelMapper;

    public CordinatorService(CordinatorRepository cordinatorRepository, ModelMapper modelMapper) {
        this.cordinatorRepository = cordinatorRepository;
        this.modelMapper = modelMapper;
    }

    public CordinatorDTO save(CordinatorCreateRequest cordinatorCreateRequest) {
        Cordinator cordinator = modelMapper.map(cordinatorCreateRequest, Cordinator.class);
        cordinator = cordinatorRepository.save(cordinator);
        return modelMapper.map(cordinator, CordinatorDTO.class);
    }

    public CordinatorDTO edit(Long id, CordinatorCreateRequest cordinatorCreateRequest) {
        Cordinator cordinator = modelMapper.map(cordinatorCreateRequest, Cordinator.class);
        cordinator.setId(id);
        cordinator = cordinatorRepository.save(cordinator);
        return modelMapper.map(cordinator, CordinatorDTO.class);
    }

    public List<CordinatorDTO> findAll() {
        List<Cordinator> cordinators = cordinatorRepository.findAll();
        return Arrays.asList(modelMapper.map(cordinators, CordinatorDTO[].class));
    }

    public void delete(Long id){
        cordinatorRepository.deleteById(id);
    }

    public CordinatorDTO findById(Long id) {
        return modelMapper.map(cordinatorRepository.getReferenceById(id), CordinatorDTO.class);
    }
}
