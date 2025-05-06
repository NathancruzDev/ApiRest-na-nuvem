package edu.dio.service;

import edu.dio.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
    List<User> getAllUsers();

}
