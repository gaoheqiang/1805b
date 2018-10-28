package cn.tedu.ssm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.UserMapper;
import cn.tedu.ssm.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	
	public List<User> findAll(){
		System.out.println("查询所有的员工");
		return userMapper.findAll();
	}
	 //cacheMager  从哪个缓存里面拿值
	 //condition 在某个条件下进行缓存    unless 当某个条件成立时 就不缓存结果信息
	// cacheNames 属性的作用是缓存到哪里
	//@Cacheable(cacheNames= {"user","temp"},condition="#id>0",unless="#result==null")//讲方法的运行结果进行缓存 以后了就不用每次进行查询数据库了 内部自己有个管理.
	
	@Cacheable(cacheNames= {"user"})
	public User get(Integer id){
		System.out.println("查询员工");
		return userMapper.get(id);
	}
	
	public void insert(User user){
		userMapper.insert(user);
	}
	
	public void update(User user){
		userMapper.update(user);
	}
	
	public void delete(Integer id){
		userMapper.delete(id);
	}
}
