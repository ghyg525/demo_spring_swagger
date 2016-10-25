package org.yangjie.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户返回实体
 * @author YangJie [2016年10月20日 下午5:19:15]
 */
@ApiModel("用户返回实体")
public class UserResponseBean {

	@ApiModelProperty("用户id")
	private int userid;
	@ApiModelProperty("用户名")
	private String username;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}