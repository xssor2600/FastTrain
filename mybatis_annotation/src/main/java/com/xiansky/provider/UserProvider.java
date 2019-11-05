package com.xiansky.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Author: xianl
 * @Date: 2019/11/5 16:12
 */
public class UserProvider {

	public String listByUserName(String username){
		return "select * from t_user where username = #{username}";
	}

	// 可以根据官方提供api来编写动态sql
	public String getBadUser(@Param("username") final String username,@Param("password") final String password){
		return new SQL(){{
			SELECT("*");
			FROM("t_user");
			if(username != null && password != null){
				WHERE("username like #{username} and password like #{password}");
			}else{
				WHERE("1=1");
			}
		}
		}.toString();
	}


}
