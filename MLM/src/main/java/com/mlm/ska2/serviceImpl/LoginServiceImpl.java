package com.mlm.ska2.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.ska2.model.Merchant;
import com.mlm.ska2.repository.MerchantRepository;
import com.mlm.ska2.request.LoginRequestVo;
import com.mlm.ska2.response.LoginResponseVo;
import com.mlm.ska2.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private MerchantRepository merchantRepository;

	@Override
	public LoginResponseVo login(LoginRequestVo loginRequest) {
		LoginResponseVo responseVo = new LoginResponseVo();
		if(loginRequest != null && !loginRequest.equals("")) {
		Merchant login = merchantRepository.findByUserNameAndPassword(loginRequest.getUserName(), loginRequest.getPassword());
		if(login != null) {
			responseVo.setMessage("Welcome! ........");
			responseVo.setStatus(200);
			return responseVo;
		}
		else {
			responseVo.setMessage("Something went wrong");
			responseVo.setStatus(400);
		}
		}
		return responseVo;
	}

	@Override
	public LoginResponseVo verifyOtp(LoginRequestVo loginRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
