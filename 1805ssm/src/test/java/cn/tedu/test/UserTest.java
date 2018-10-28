package cn.tedu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.ssm.mapper.UserMapper;
import cn.tedu.ssm.pojo.User;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void tests() {
		User user=userMapper.get(1);
		System.out.println(user.getAddress());
		
		
	}

}
