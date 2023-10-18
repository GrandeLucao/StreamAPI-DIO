package lucas.dio.streamAPIDIOProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.dio.streamAPIDIOProject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
    
}
