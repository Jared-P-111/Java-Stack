package project.dojosandninjas.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dojosandninjas.model.Dojo;
import project.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

  @Autowired
  DojoRepository dojoRepository;

  public void createDojo(Dojo dojo) {
    dojoRepository.save(dojo);
  }

  public List<Dojo> getDojos() {
    return dojoRepository.findAll();
  }

  public Dojo getOne(Long id) {
    Optional<Dojo> optionalDojo = dojoRepository.findById(id);
    return optionalDojo.orElse(null);
  }
}
