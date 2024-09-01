package me.dio.publi_api_spring.domain.service;

import me.dio.publi_api_spring.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
