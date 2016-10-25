package org.yangjie.swagger.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yangjie.swagger.entity.UserRequestBean;
import org.yangjie.swagger.entity.UserResponseBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags="用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

	
	/**
	 * 获取
	 * @author YangJie [2016年10月20日 下午5:22:34]
	 * @param userid
	 * @return
	 */
	@ApiOperation(value="获取用户", response=UserResponseBean.class)
	@RequestMapping(value="/{userid}", method=RequestMethod.GET)
	public UserResponseBean get(
			@ApiParam(value="用户id", required=true) 
			@PathVariable("userid") int userid){
		return null;
	}
	
	/**
	 * 添加
	 * @author YangJie [2016年10月20日 下午5:22:45]
	 * @param requestBean
	 * @return
	 */
	@ApiOperation("添加用户")
	@RequestMapping(method=RequestMethod.POST)
	public boolean add(@ApiParam("用户添加实体") @RequestBody UserRequestBean requestBean){
		return false;
	}
	
	/**
	 * 修改
	 * @author YangJie [2016年10月20日 下午5:22:51]
	 * @param requestBean
	 * @return
	 */
	@ApiOperation("修改用户")
	@RequestMapping(method=RequestMethod.PUT)
	public boolean update(@ApiParam("用户修改实体") @RequestBody UserRequestBean requestBean){
		return false;
	}
	
	/**
	 * 删除
	 * @author YangJie [2016年10月20日 下午5:22:56]
	 * @param userid
	 * @return
	 */
	@ApiOperation("删除用户")
	@RequestMapping(value="/{userid}", method=RequestMethod.DELETE)
	public boolean delete(
			@ApiParam(value="用户id", required=true)
			@PathVariable("userid")int userid){
		return false;
	}
	
}
