package cn.tedu.ssm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private Integer id;
	private String lastName;
	
	//标识格式：yyyy-MM-dd
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
