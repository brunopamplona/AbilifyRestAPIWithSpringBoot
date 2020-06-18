package com.abilify.springbootrestapi.domain.homeservices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

public class ServiceOrders {

    private UUID id;
    private OrderStatus status;
    private ArrayList orderItems;
    private BigDecimal price;

    public ServiceOrders(UUID id, ServiceCatalog service) {

    }

    public void complete() {

    }

    public void addOrder() {

    }

    public void removeOrder(UUID id) {

    }

    public UUID getId() {
        return this.id;
    }

    // getters
}
