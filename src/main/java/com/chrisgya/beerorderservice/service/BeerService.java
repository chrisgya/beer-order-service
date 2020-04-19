package com.chrisgya.beerorderservice.service;


import com.chrisgya.beerorderservice.model.dto.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);
}
