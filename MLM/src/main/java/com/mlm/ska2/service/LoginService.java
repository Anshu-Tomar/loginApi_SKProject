package com.mlm.ska2.service;

import org.springframework.stereotype.Service;

import com.mlm.ska2.request.LoginRequestVo;
import com.mlm.ska2.response.LoginResponseVo;


public interface LoginService {
	
	LoginResponseVo login(LoginRequestVo loginRequest);
	LoginResponseVo verifyOtp(LoginRequestVo loginRequest);

}
