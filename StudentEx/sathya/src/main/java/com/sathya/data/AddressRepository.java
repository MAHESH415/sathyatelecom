package com.sathya.data;


import org.springframework.data.repository.CrudRepository;

import com.sathya.entities.Address;

public interface AddressRepository  extends CrudRepository< Address, Integer> {

}
