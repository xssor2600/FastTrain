package com.xiansky.mapper;

import com.xiansky.bo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: xianl
 * @Date: 2019/11/5 17:08
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {


	@Select("select * from t_user")
	List<User> listUsers();

}
