package com.coral.scheduled.test;

import com.coral.scheduled.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ScheduleApplicationTests {

	@Test
	public void test() throws Exception {
		System.out.println("Run Schedule");
		Thread.sleep(10000);
	}
}
