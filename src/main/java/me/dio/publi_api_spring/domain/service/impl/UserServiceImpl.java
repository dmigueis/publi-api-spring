package me.dio.publi_api_spring.domain.service.impl;

import me.dio.publi_api_spring.domain.model.User;
import me.dio.publi_api_spring.domain.repository.UserRepository;
import me.dio.publi_api_spring.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {

        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("O número da conta "+userToCreate.getAccount().getNumber()+" já está cadastrado!");
        }

        if(userRepository.existsByCardNumber(userToCreate.getCard().getNumber())){
            throw new IllegalArgumentException("O número do cartão "+userToCreate.getCard().getNumber()+" já está cadastrado!");
        }
        return userRepository.save(userToCreate);
    }
}
