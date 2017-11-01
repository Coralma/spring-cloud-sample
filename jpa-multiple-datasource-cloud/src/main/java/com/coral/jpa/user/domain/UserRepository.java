package com.coral.jpa.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * @version 1.0.0
 * @date 16/3/23 下午2:34.
 */
public interface UserRepository extends JpaRepository<User, Long> {


}
