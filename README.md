# ao-cloud
微服务架构设计
	                                                              作者：王雪强，QQ:592470261
1.序言
		微服务的基本思想在于考虑围绕着业务领域组件来创建应用，
	这些应用可独立地进行开发、管理和加速。在分散的组件中使用微服务云架构和平台，
	使部署、管理和服务功能交付变得更加简单。
2.技术选型
	开发工具：Eclipse/IntelliJ IDEA
	版本控制：Git
	自动化工程构建：Jenkins
	日志收集分析：ElasticSearch+Logstash+Kinana
	微服务配置中心：Apollo
	微服务相关：Eureka ,Feign,Ribbon,Hystrix,Zull,Sleuth,Swagger
	缓存：Redis
	消息中间件：RabbitMQ
	分布式锁：Redis/Zookeeper
	文件上传：阿里云存储
	消息通知：邮件/短信
3.系统架构
3.1项目结构
	ao-cloud
	--------ao-common-service(公共组件)
	--------ao-discovery-eureka(Eureka注册中心)
	--------ao-hystrix-dashboard（可视化监控数据）
	--------ao-gateway-zuul（路由转发）
	--------ao-hystrix-turbine（监控微服务）
	--------ao-api-service（微服务消费者）
	--------ao-provider-service（微服务生产者）
	--------ao-fileupload-service（文件上传微服务）
	--------ao-messge-notice-service（消息通知微服务）
3.2数据结构
统一返回数据结构
{ 
"data": {},      数据
 	"msg": "string", 描述：OK或者错误描述
"status": 0      状态：200|500等
 }
4.组建引入
4.1Swagger组建
版本：
	<swagger2.version>2.6.1</swagger2.version>
	依赖：
	<!-- swagger2 add by wangxueqiang start -->
	<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>${swagger2.version}</version>
	</dependency>
	<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>${swagger2.version}</version>
	</dependency>
	<!-- swagger2 add by wangxueqiang end -->
配置类：
	@EnableSwagger2
	@Configuration
	public class SwaggerConfig {
		@Bean
		public Docket createRestApi(){
			  return new Docket(DocumentationType.SWAGGER_2)
					  .groupName("AO").apiInfo(apiInfo()) //组名
					  .select() //选择哪些路径和api会生成doucument
					  //为当前包下的api路径监控
		  .apis(RequestHandlerSelectors.basePackage("com.zkh.cloud.controller"))
	.paths(PathSelectors.any())
	//对所用路径进行监控
		   .build();
	//regex 过滤接口
		}
		//构建api文档的详细信息方法
		private  ApiInfo apiInfo(){
			  return new ApiInfoBuilder()
			      .title("AO派单系统RestFulApi")//页面标题
			      .contact(new Contact("Allen","","592470261@qq.com"))
	//创建人
			      .version("1.0")  //版本号
			      .description("AO派单系统相关Api")
			      .build();		  
		}
	}
	
4.2Apollo配置中心
版本：
	<apollo.version>1.0.0</apollo.version>
依赖：
	<!-- apollo add by wangxueqiang start -->
	<dependency>
	<groupId>com.ctrip.framework.apollo</groupId>
	<artifactId>apollo-client</artifactId>
	<version>${apollo.version}</version>
	</dependency>
	<!-- apollo add by wangxueqiang end -->
在启动类添加注解：
	@EnableApolloConfig
配置application.properties：
	#apollo
	app.id=ao-provider-service
	apollo.meta=http://localhost:8080
4.3RabbitMq消息中间件
依赖：
	<!-- rabbitmq  start-->
	 <dependency>
	      <groupId>org.springframework.boot</groupId>
	      <artifactId>spring-boot-starter-amqp</artifactId>
	   </dependency>
	 <!-- rabbitmq  end-->
配置application.properties：
	#rabbitmq
	spring.rabbitmq.host=39.105.200.153
	spring.rabbitmq.port=5672
	spring.rabbitmq.username=admin
	spring.rabbitmq.password=admin
4.4阿里云存储
依赖：
	 <!-- aliyun  start-->
	<dependency>
	  <groupId>com.aliyun</groupId>
	  <artifactId>aliyun-java-sdk-dysmsapi</artifactId> 	 <version>1.0.0</version>
	</dependency>
	<dependency>
	<groupId>com.aliyun.oss</groupId>
	<artifactId>aliyun-sdk-oss</artifactId>
	 	<version>3.0.0</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
	<artifactId>aliyun-java-sdk-dysmsapi</artifactId>
	<version>1.0.0</version>
	</dependency>
	<!-- aliyun  end -->
4.5邮件发送
依赖：
	<!-- email  start -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-mail</artifactId>
	</dependency>
	<!-- email  end -->
配置：
	#email
	spring.mail.host=smtp.qq.com
	spring.mail.username=592470261@qq.com
	spring.mail.password=xxx
	spring.mail.port=587
	spring.mail.protocol=smtp
4.6Logstash记录日志
依赖：
	<!-- 微服务跟踪 add by wangxueqiang start -->
	<dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-starter-sleuth</artifactId>
	</dependency>
	<dependency>
		<groupId>net.logstash.logback</groupId>
		<artifactId>logstash-logback-encoder</artifactId>
		<version>4.8</version>
		<scope>runtime</scope>
	</dependency>
	<!-- 微服务跟踪 add by wangxueqiang start -->
配置文件：bootstrap.yml
spring:
  application:
    name: ao-provider-service
配置文件：
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
	<include resource="org/springframework/boot/logging/logback/defaults.xml" />
	<springProperty scope="context" name="springAppName"
		source="spring.application.name" />
	<!-- Example for logging into the build folder of your project -->
	<property name="LOG_FILE" value="${BUILD_FOLDER:-build}/${springAppName}" />
	<property name="CONSOLE_LOG_PATTERN"
		value="%clr(%d{yyyy-MM-dd HH:mm:ss.SSS}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr([${springAppName:-},%X{X-B3-TraceId:-},%X{X-B3-SpanId:-},%X{X-B3-ParentSpanId:-},%X{X-Span-Export:-}]){yellow} %clr(${PID:- }){magenta} %clr(---){faint} %clr([%15.15t]){faint} %clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}" />
	<!-- Appender to log to console -->
	<appender name="console" class="ch.qos.logback.core.ConsoleAppender">
		<filter class="ch.qos.logback.classic.filter.ThresholdFilter">
			<!-- Minimum logging level to be presented in the console logs -->
			<level>DEBUG</level>
		</filter>
		<encoder>
			<pattern>${CONSOLE_LOG_PATTERN}</pattern>
			<charset>utf8</charset>
		</encoder>
	</appender>
	<!-- Appender to log to file -->
	<appender name="flatfile"
		class="ch.qos.logback.core.rolling.RollingFileAppender">
		<file>${LOG_FILE}</file>
		<rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
			<fileNamePattern>${LOG_FILE}.%d{yyyy-MM-dd}.gz</fileNamePattern>
			<maxHistory>7</maxHistory>
		</rollingPolicy>
		<encoder>
			<pattern>${CONSOLE_LOG_PATTERN}</pattern>
			<charset>utf8</charset>
		</encoder>
	</appender>
	<!-- Appender to log to file in a JSON format -->
	<appender name="logstash"
		class="ch.qos.logback.core.rolling.RollingFileAppender">
		<file>${LOG_FILE}.json</file>
		<rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
			<fileNamePattern>${LOG_FILE}.json.%d{yyyy-MM-dd}.gz</fileNamePattern>
			<maxHistory>7</maxHistory>
		</rollingPolicy>
		<encoder
			class="net.logstash.logback.encoder.LoggingEventCompositeJsonEncoder">
			<providers>
				<timestamp>
					<timeZone>UTC</timeZone>
				</timestamp>
				<pattern>
					<pattern>
						{
						"severity": "%level",
						"service": "${springAppName:-}",
						"trace": "%X{X-B3-TraceId:-}",
						"span": "%X{X-B3-SpanId:-}",
						"parent": "%X{X-B3-ParentSpanId:-}",
						"exportable": "%X{X-Span-Export:-}",
						"pid": "${PID:-}",
						"thread": "%thread",
						"class": "%logger{40}",
						"rest": "%message"
						}
					</pattern>
				</pattern>
			</providers>
		</encoder>
	</appender>
	<root level="INFO">
		<appender-ref ref="console" />
		<appender-ref ref="logstash" />
		<!--<appender-ref ref="flatfile"/> -->
	</root>
</configuration>

编写Logstash.conf
	input {
	  file {
	    codec => json
	    path => "G:/opt/build/*.json"
	  }
	}
	filter {
	  grok {
	    match => { "message" => "%{TIMESTAMP_ISO8601:timestamp}\s+%{LOGLEVEL:severity}\s+\[%{DATA:service},%{DATA:trace},%{DATA:span},%{DATA:exportable}\]\s+%{DATA:pid}---\s+\[%{DATA:thread}\]\s+%{DATA:class}\s+:\s+%{GREEDYDATA:rest}" }
	  }
	}
	output {
	  elasticsearch {
	    hosts => "localhost:9200"
	  }
	}
5.效果展示
5.1Swagger组建展示
5.2Apollo配置中心展示
5.3RabbitMq消息中间件展示
5.4阿里云存储
5.5Jenkins自动化构建
5.6ElasticSearch+Logstash+Kinana日志分析
6.系统展示（注释：人人开源项目二次开发）
7.源码地址
微服务：
https://github.com/SayHelloAllen/ao-cloud
项目：
https://github.com/SayHelloAllen/ao-sys-web
文档：
https://pan.baidu.com/s/1QcLlL7-ahLilJxNTa5qmcg
8.Next
下文将会详细介相关组建安装，敬请期待。