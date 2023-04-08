package dio.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.datajpa.modelo.User;

public interface UserRepository extends JpaRepository<User, Integer>{ 
}
