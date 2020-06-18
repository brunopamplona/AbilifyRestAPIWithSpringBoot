package com.abilify.springbootrestapi.infrastructure.homeservices;

import com.abilify.springbootrestapi.domain.homeservices.ServiceOrders;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Optional<ServiceOrders> findById(UUID id);

    void save(ServiceOrders order);
}
