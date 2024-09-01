package me.dio.publi_api_spring.domain.repository;

import me.dio.publi_api_spring.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //JpaRepository<T, D> T = Entidade que vamos utilizar e D = Tipo

    boolean existsByAccountNumber(String accountNumber);
    boolean existsByCardNumber(String cardNumber);
}
