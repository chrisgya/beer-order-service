package com.chrisgya.beerorderservice.repository;


import com.chrisgya.beerorderservice.entity.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}

