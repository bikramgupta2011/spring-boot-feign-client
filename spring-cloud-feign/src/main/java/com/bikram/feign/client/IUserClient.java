package com.bikram.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bikram.feign.dto.UserResponse;

@FeignClient(name = "user", url = "https://jsonplaceholder.typicode.com/")
public interface IUserClient {

	@GetMapping("/posts")
	public List<UserResponse> getAllUsers();
}
