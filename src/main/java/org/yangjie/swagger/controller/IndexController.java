package org.yangjie.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="首页接口")
@RestController
public class IndexController {

	/**
	 * 首页
	 * @author YangJie [2016年10月20日 下午4:39:52]
	 * @return
	 */
	@ApiOperation("首页")
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
}
