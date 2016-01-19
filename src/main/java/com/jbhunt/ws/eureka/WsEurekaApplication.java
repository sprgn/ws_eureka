package com.jbhunt.ws.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient  //this will register this instance of eureka with a replica if one is defined
//@ServletComponentScan (basePackageClasses = LogbackShutdownListener.class)
//@EnableMBeanExport(defaultDomain="ws_eurekaDomain")
public class WsEurekaApplication extends SpringBootServletInitializer {


        public static void main(String[] args) {
		SpringApplication.run(WsEurekaApplication.class, args);
	}
}
