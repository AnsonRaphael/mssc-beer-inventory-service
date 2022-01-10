package com.nanos.msscbeerinventoryservice.service;

import com.nanos.brewery.model.BeerOrderDto;

public interface AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);
    void deallocateOrder(BeerOrderDto beerOrderDto);
}
