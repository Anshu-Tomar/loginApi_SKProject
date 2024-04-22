package com.mlm.ska2.service;

import com.mlm.ska2.model.Merchant;
import com.mlm.ska2.request.MerchantRequestVo;
import com.mlm.ska2.response.MerchantResponseVo;

public interface MerchantService {
	
	MerchantResponseVo saveMerchant(MerchantRequestVo request);

}
