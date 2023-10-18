package lucas.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import lucas.dio.service.UserService;
import lucas.dio.streamAPIDIOProject.model.User;
import lucas.dio.streamAPIDIOProject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User findById(Long id) {
       return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException();
        }
        return userRepository.save(userToCreate);
    }
    
}
