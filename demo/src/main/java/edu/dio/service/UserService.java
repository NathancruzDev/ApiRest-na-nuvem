package edu.dio.service;

import edu.dio.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
