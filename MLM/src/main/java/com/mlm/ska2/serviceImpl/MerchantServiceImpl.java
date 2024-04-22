package com.mlm.ska2.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.ska2.model.Merchant;
import com.mlm.ska2.repository.MerchantRepository;
import com.mlm.ska2.request.MerchantRequestVo;
import com.mlm.ska2.response.MerchantResponseVo;
import com.mlm.ska2.service.MerchantService;

@Service
public class MerchantServiceImpl implements MerchantService{
	
	@Autowired
	private MerchantRepository merchantRepository;

	@Override
	public MerchantResponseVo saveMerchant(MerchantRequestVo request) {
		
		MerchantResponseVo responseVo = new MerchantResponseVo();
		Merchant merchant = new Merchant();
		if(request != null && !request.equals("")) {
		BeanUtils.copyProperties(request, merchant);
		}
		if(merchant != null) {
		Merchant save = merchantRepository.save(merchant);
		responseVo.setMessage("You have successfully Registered. Your MemberID is : "+save.getId());
		responseVo.setStatus(200);
		
		}else {
			responseVo.setMessage("something went wrong!....");
			responseVo.setStatus(400);
		}
		return responseVo;
	}

}
