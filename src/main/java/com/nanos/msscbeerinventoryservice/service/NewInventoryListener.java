package com.nanos.msscbeerinventoryservice.service;

import com.nanos.common.events.NewInventoryEvent;
import com.nanos.msscbeerinventoryservice.config.JmsConfig;
import com.nanos.msscbeerinventoryservice.domain.BeerInventory;
import com.nanos.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Data
@Slf4j
@Service
public class NewInventoryListener {
    private final BeerInventoryRepository beerInventoryRepository;
    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    public void listen(NewInventoryEvent event){
        log.debug("Got Inventory: " + event.toString());

        beerInventoryRepository.save(BeerInventory.builder()
                .beerId(event.getBeerDto().getBeerId())
                .upc(event.getBeerDto().getUpc())
                .quantityOnHand(event.getBeerDto().getQuantityOnHand())
                .build());

    }
}
