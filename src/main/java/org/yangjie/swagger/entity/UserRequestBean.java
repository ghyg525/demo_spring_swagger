package org.yangjie.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户请求实体
 * @author YangJie [2016年10月20日 下午5:18:14]
 */
@ApiModel("用户请求实体")
public class UserRequestBean {

	@ApiModelProperty("用户名")
	private String username;
	@ApiModelProperty("密码")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
