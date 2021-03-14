package com.otienochris.msscbreweryservice.web.mappers;

import com.otienochris.msscbreweryservice.domain.Beer;
import com.otienochris.msscbreweryservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
