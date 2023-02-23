package project.dojosandninjas.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import project.dojosandninjas.model.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
  List<Ninja> findAll();
}
