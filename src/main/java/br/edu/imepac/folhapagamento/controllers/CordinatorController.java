package br.edu.imepac.folhapagamento.controllers;

import br.edu.imepac.folhapagamento.domains.cordinator.CordinatorCreateRequest;
import br.edu.imepac.folhapagamento.domains.cordinator.CordinatorDTO;
import br.edu.imepac.folhapagamento.services.CordinatorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cordinator")
public class CordinatorController {

    private final CordinatorService cordinatorService;

    public CordinatorController(CordinatorService cordinatorService) {
        this.cordinatorService = cordinatorService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public CordinatorDTO addCordinator(@RequestBody CordinatorCreateRequest cordinatorCreateRequest) {
        return cordinatorService.save(cordinatorCreateRequest);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public CordinatorDTO editCordinator(@PathVariable("id") Long id, @RequestBody CordinatorCreateRequest cordinatorCreateRequest) {
        return cordinatorService.edit(id, cordinatorCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<CordinatorDTO> getAllCordinator() {
        return cordinatorService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public CordinatorDTO getCordinatorById(@PathVariable("id") Long id) {
        CordinatorDTO d = cordinatorService.findById(id);
        System.out.println(d.getAddress());
        return d;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
    public void deleteCordinator(@PathVariable("id") Long id) {
        cordinatorService.delete(id);
    }
}
