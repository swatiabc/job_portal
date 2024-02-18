package com.portal.job.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> get_all_users() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        userRepository
    }
}
