package com.chrisgya.beerorderservice.service;

import com.chrisgya.beerorderservice.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);

}
