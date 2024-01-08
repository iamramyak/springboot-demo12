package com.example.demo.serviceimpl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
   private UserRepository userRepository;

    @Override
    public User createUser(User user) {
       return userRepository.save(user);

    }

    @Override
    public User create(User user) {

        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> OptionalUser = userRepository.findById(userId);
        return OptionalUser.get();

    }
}

