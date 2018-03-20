package com.luoshupeng.multidatasource.repository;

import com.luoshupeng.multidatasource.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luoshupeng on 2018-03-20 8:53
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
