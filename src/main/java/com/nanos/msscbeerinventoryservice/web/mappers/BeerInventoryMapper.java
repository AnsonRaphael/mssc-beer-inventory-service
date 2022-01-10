package com.nanos.msscbeerinventoryservice.web.mappers;

import com.nanos.brewery.model.BeerInventoryDto;
import com.nanos.msscbeerinventoryservice.domain.BeerInventory;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
