package com.bikram.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikram.feign.client.IUserClient;
import com.bikram.feign.dto.UserResponse;

@SpringBootApplication
@EnableFeignClients
@RestController
@RequestMapping("/feignClient")
public class SpringCloudFeignApplication {
	
	@Autowired
	private IUserClient client;
	
	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUsers(){
		return this.client.getAllUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

}
