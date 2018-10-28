package cn.tedu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper {
	//<select id="findAll" resultType="User">
	public List<User> findAll();
	
	//获取一个用户信息
	@Select("SELECT * FROM USER WHERE id=#{id}")
	public User get(@Param("id") Integer id);
	
	//新增
	@Insert("INSERT INTO USER (NAME,birthday,address)"
			+ " VALUES(#{name},#{birthday},#{address});")
	public void insert(User user);
	
	//修改
	@Update("UPDATE USER"
			+ " SET NAME=#{name},birthday=#{birthday},address=#{address} "
			+ " WHERE id=#{id}")
	public void update(User user);
	
	//删除
	@Delete("DELETE FROM USER WHERE id=#{id}")
	public void delete(@Param("id") Integer id);
}




