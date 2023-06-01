package com.example.QL_Sach.services;

import com.example.QL_Sach.entity.User;
import com.example.QL_Sach.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }
}
