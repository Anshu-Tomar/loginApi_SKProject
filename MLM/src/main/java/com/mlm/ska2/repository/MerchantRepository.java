package com.mlm.ska2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mlm.ska2.model.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long>{

	Merchant findByUserNameAndPassword(String userName, String password);
}
