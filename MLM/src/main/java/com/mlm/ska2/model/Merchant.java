package com.mlm.ska2.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="users")
public class Merchant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long sponsorId;
	private String userName;
	private String fatherName;
	private String dateOfBirth;
	private String mobileNumber;
	private String email;
	private String address;
	private String password;
	
	@CreationTimestamp
	private LocalDateTime createDate;
	@UpdateTimestamp
	private LocalDateTime modifyDate;
	
	private String panCardNumber;
	private String aadharCardNumber;
	private String accountNumber;
	private String accountName;
	private String ifscCode;
	private String branch;
	private String nomineeName;
	private String nomineeDateOfBirth;
	private String nomineeMobileNumber;
	
	
	

}
