package com.luoshupeng.multidatasource.configurer;

import com.luoshupeng.multidatasource.primary.entity.User;
import com.luoshupeng.multidatasource.primary.repository.UserRepository;
import com.luoshupeng.multidatasource.secondary.entity.Message;
import com.luoshupeng.multidatasource.secondary.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by luoshupeng on 2018-03-20 10:38
 */
@Configuration
public class InitDataConfigurer {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(userRepository.save(new User("TESTNAME-" + i, 20 + i)));
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(messageRepository.save(new Message("MSGNAME-" + i, "MSGCONTENT-" + i)));
        }
    }
}
