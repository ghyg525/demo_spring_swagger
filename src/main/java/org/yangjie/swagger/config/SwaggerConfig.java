package org.yangjie.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 文档工具配置
 * @author YangJie [2016年10月20日 下午4:25:56]
 */
@Configuration
@EnableSwagger2 // 启用swagger
public class SwaggerConfig {

	@Bean  
	public Docket docket() {  
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
	}  

	/**
	 * api格式
	 * @author YangJie [2016年3月21日 上午10:52:36]
	 * @return
	 */
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()  
                .title("API文档") 
                .version("1.0.0")  
                .description("使用swagger自动生成")
                .build();  
    }
	
}
