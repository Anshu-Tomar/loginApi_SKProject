package com.mlm.ska2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.ska2.request.MerchantRequestVo;
import com.mlm.ska2.response.MerchantResponseVo;
import com.mlm.ska2.serviceImpl.MerchantServiceImpl;

@CrossOrigin(origins = "http://localhost:2300")
@RestController
@RequestMapping("/onboard")
public class MerchantController {

	@Autowired
	private MerchantServiceImpl merchantService;
	
	@PostMapping("/saveDetailsOnboard")
	public MerchantResponseVo saveMerchant(@RequestBody MerchantRequestVo merchantRequest) {
		MerchantResponseVo responseVo = new MerchantResponseVo();
		
		if(merchantRequest != null && !merchantRequest.equals("")) {
			responseVo = merchantService.saveMerchant(merchantRequest);
		}
		return responseVo;
		
	}
}
