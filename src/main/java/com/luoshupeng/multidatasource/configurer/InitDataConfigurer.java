package com.luoshupeng.multidatasource.configurer;

import com.luoshupeng.multidatasource.entity.User;
import com.luoshupeng.multidatasource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by luoshupeng on 2018-03-20 9:25
 */
@Configuration
public class InitDataConfigurer {

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(userRepository.save(new User("TESTNAME-" + i, 20 + i)));
        }
    }
}
