package com.abilify.springbootrestapi.services.customers;

import com.abilify.springbootrestapi.domain.customers.Customers;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class CustomerService {

    private final AtomicLong counter = new AtomicLong();

    public Customers findById(String id)
    {
        Customers homeOwner = new Customers(1, "Bruno",
            "bruno.pamplona77", "Corte Real",
            "brubru#2011", "#2123#2352#3513#2423", "069324517-43",
            "30.801.795.0001-37","bruno.cortereal@gmail.com", "21 99255 1471",
            "Rio de Janeiro");
        return homeOwner;
    }

}
