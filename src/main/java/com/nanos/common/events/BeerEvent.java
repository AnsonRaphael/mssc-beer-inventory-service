package com.nanos.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BeerEvent implements Serializable {
    static final long serialVersionUID= -4971759396032732949L;

    private BeerDto beerDto;
}
