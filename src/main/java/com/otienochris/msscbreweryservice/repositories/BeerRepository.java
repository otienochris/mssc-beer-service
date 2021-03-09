package com.otienochris.msscbreweryservice.repositories;


import com.otienochris.msscbreweryservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
