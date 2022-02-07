package com.in28minutes.rest.proxy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="api-gateway")
public interface ServiceTwoFeignClient {

	
	@GetMapping("/service-two/throttling/users")
	public ResponseEntity<Object> getUsers();
	
	@GetMapping("/service-two/throttling/message")
	public String getMessage();
}
