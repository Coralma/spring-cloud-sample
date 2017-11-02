package com.coral.redis;

import com.coral.redis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.*;

/**
 */
@Configuration
public class RedisConfig {

   /* @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jcf = new JedisConnectionFactory();
        jcf.setHostName(host);
        jcf.setPort(port);
        return jcf;
    }*/

   @Autowired
    JedisConnectionFactory factory;

    @Bean
    public RedisTemplate<String, User> redisTemplate() {
        RedisTemplate<String, User> template = new RedisTemplate<String, User>();
        //template.setConnectionFactory(jedisConnectionFactory());
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }


}
