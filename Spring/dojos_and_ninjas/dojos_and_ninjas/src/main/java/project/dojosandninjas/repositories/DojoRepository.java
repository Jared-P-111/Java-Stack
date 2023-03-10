package project.dojosandninjas.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import project.dojosandninjas.model.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
  List<Dojo> findAll();
}
