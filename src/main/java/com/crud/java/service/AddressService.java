package com.crud.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.java.entity.Address;
import com.crud.java.repo.AddressRepo;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addrepo;
	public Address createAddress(Address add) {
		return addrepo.save(add);
	}
	
}
