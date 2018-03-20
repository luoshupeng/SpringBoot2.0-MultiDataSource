package com.luoshupeng.multidatasource.primary.repository;

import com.luoshupeng.multidatasource.primary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luoshupeng on 2018-03-20 10:22
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
