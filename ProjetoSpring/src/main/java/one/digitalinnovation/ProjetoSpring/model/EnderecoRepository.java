package one.digitalinnovation.ProjetoSpring.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EnderecoRepository extends CrudRepository <Endereco, String> {
    
}
