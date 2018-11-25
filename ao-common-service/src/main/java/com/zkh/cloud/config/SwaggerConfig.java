package com.zkh.cloud.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
//spring自己本身的注解
//为了集成swagger2 通过
//@Import({Swagger2DocumentationConfiguration.class})
//引入了一个Swagger2DocumentationConfiguration类型的配置bean
//而这个就是swagger的核心配置，由通过EnableSwagger2 的注解
//向springContext注入了一系列的bean，并在系统启动的时候自动
//扫描系统的controller类，生成相应的api信息并且缓存起来。
//此外它还注入了一些被@Controller注解标识的controller类，
//作为ui模块访问api列表的入口
//比如swagger2Controller类。
//这个controller是ui模块中用来访问api列表的界面地址
//在访问http://127.0.0.1:8080/swagger-ui.html查看api列表时
//通过浏览器抓包就可以看到
//它是通过类似于http://39.105.200.153:8080/v2/api-docs?group=sysGroup
//这样的地址异步获取api信息(json格式)并显示到界面上
//这个地址后台对应的Controller入口就是上下文的swagger2Controller类
public class SwaggerConfig {
	
	@Bean
	public Docket createRestApi(){
		  return new Docket(DocumentationType.SWAGGER_2)
				  .groupName("AO").apiInfo(apiInfo()) //组名
				  .select() //选择哪些路径和api会生成doucument
				  //为当前包下的api路径监控
				  .apis(RequestHandlerSelectors.basePackage("com.zkh.cloud.controller"))
				  .paths(PathSelectors.any()) //对所用路径进行监控
				  //regex 过滤接口
				  .build();
	}
	
	//构建api文档的详细信息方法
	private  ApiInfo apiInfo(){
		  return new ApiInfoBuilder()
		      .title("上海震坤行AO派单系统RestFulApi")		  //页面标题
		      .contact(new Contact("Allen","","592470261@qq.com"))//创建人
		      .version("1.0")  //版本号
		      .description("AO派单系统相关Api")
		      .build();		  
	}

}
