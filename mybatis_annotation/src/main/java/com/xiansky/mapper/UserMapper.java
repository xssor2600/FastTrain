package com.xiansky.mapper;

import com.xiansky.bo.User;
import com.xiansky.provider.UserProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: xianl
 * @Date: 2019/11/5 16:10
 */
@Mapper
public interface UserMapper {

	// 通过注解编写SQL
	@Select("select * from t_user")
	List<User> list();


	// 通过注解指定某个工具类方法来动态编写sql.
	@SelectProvider(type = UserProvider.class,method = "listByUserName")
	List<User> listByUserName(String username);


	@Results({
			@Result(property = "userId",column = "USER_ID"),
			@Result(property = "username",column = "USERNAME"),
			@Result(property = "password",column = "PASSWORD"),
			@Result(property = "mobileNum",column = "PHONE_NUM")
	})
	@Select("select * from t_user")
	List<User> listSample();


	@Select("select * from t_user where username = #{username} and password = #{password}")
	User get(@Param("username")String username,@Param("password")String password);


	@SelectProvider(type = UserProvider.class,method = "getBadUser")
	User getBadUser(@Param("username")String username,@Param("password")String password);

}
