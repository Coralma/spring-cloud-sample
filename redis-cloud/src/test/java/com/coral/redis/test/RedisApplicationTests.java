package com.coral.redis.test;

import com.coral.redis.Application;
import com.coral.redis.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, User> redisTemplate;

	@Test
	public void test() throws Exception {

		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));

		// 保存对象
		User user = new User("Coral", 20);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		user = new User("Leo", 30);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		user = new User("Andy", 40);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		Assert.assertEquals(20, redisTemplate.opsForValue().get("Coral").getAge().longValue());
		Assert.assertEquals(30, redisTemplate.opsForValue().get("Leo").getAge().longValue());
		Assert.assertEquals(40, redisTemplate.opsForValue().get("Andy").getAge().longValue());

	}

}
