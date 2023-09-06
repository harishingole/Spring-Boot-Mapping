package com.crud.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.java.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{

}
