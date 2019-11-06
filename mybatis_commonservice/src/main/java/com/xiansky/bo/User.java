package com.xiansky.bo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: xianl
 * @Date: 2019/11/5 16:08
 * 通用mapper需要jpa的表实体映射
 */
@Data
@Table(name = "T_USER")
public class User {
	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PHONE_NUM")
	private String mobileNum;

}
