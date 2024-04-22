package com.mlm.ska2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.ska2.request.LoginRequestVo;
import com.mlm.ska2.response.LoginResponseVo;
import com.mlm.ska2.service.LoginService;
import com.mlm.ska2.serviceImpl.LoginServiceImpl;

@CrossOrigin(origins = "http://localhost:2300")
@RestController
public class LoginController {

	@Autowired
	private LoginServiceImpl loginService;
	
	
	@PostMapping("/login")
	public LoginResponseVo login(@RequestBody LoginRequestVo request) {
		
		LoginResponseVo responseVo = new LoginResponseVo();
		
		responseVo = loginService.login(request);
		if(responseVo.getStatus() == 200) {
			responseVo.setMessage(responseVo.getMessage());
			responseVo.setStatus(responseVo.getStatus());
			return responseVo;
		}else {
			responseVo.setMessage(responseVo.getMessage());
			responseVo.setStatus(responseVo.getStatus());
		}
		
		return responseVo;
	}
}
