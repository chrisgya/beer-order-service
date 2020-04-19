package com.chrisgya.beerorderservice.model.customMapper;

import com.chrisgya.beerorderservice.entity.Customer;
import com.chrisgya.beerorderservice.model.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}

