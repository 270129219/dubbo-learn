package com.dubbo.learn;

import com.dubbo.learn.domain.mapper.BillnoSnMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboRouterApplicationTests {

	@Autowired
	BillnoSnMapper billnoSnMapper;

	@Test
	public void contextLoads() {
	}

}
