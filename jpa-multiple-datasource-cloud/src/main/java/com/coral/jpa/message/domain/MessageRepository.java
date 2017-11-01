package com.coral.jpa.message.domain;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @version 1.0.0
 * @date 16/3/23 下午2:34.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {


}
