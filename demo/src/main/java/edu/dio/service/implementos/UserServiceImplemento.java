package edu.dio.service.implementos;

import edu.dio.model.User;
import edu.dio.repository.UserRepository;
import edu.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImplemento implements UserService {
    //interface de acesso a dados.
    private final UserRepository userRepository;

    public UserServiceImplemento(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This user Id already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
