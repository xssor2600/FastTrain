package com.xiansky.bo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: xianl
 * @Date: 2019/11/6 10:51
 */
@Data
public class UserTmp {

	private String userId;

	private String username;

	private Date date = new Date();

}
