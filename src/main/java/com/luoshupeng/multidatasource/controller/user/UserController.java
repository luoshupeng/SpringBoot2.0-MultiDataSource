package com.luoshupeng.multidatasource.controller.user;

import com.luoshupeng.multidatasource.entity.User;
import com.luoshupeng.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luoshupeng on 2018-03-20 9:16
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public ResponseEntity<List<User>> list() {
        return new ResponseEntity<>(userService.list(), HttpStatus.OK);
    }
}
