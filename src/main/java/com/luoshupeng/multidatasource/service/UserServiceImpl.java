package com.luoshupeng.multidatasource.service;

import com.luoshupeng.multidatasource.entity.User;
import com.luoshupeng.multidatasource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luoshupeng on 2018-03-20 8:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
