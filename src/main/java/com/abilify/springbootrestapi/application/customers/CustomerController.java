package com.abilify.springbootrestapi.application.customers;

import com.abilify.springbootrestapi.services.customers.CustomerService;
import com.abilify.springbootrestapi.domain.customers.CreditCardPayment;
import com.abilify.springbootrestapi.domain.customers.Customers;
import com.abilify.springbootrestapi.domain.customers.FullAddress;
import com.abilify.springbootrestapi.domain.customers.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-management/customers/")
public class CustomerController {

    /*
     HOME OWNER´S CUSTOMERS DOMAIN:

     1) REGISTER AS HOME CUSTOMER
     2) LOG-IN AS HOME OWNER CUSTOMER
     3) FILL ACCOUNT HOME OWNER CUSTOMERS DETAILS (FULL ADDRESS, CREDIT CARD ACCOUNT, PAYMENT TYPE, ETC)
     4) EDIT OR DELETE HOME OWNER CUSTOMERS ACCOUNT DETAILS
     5) SUPPLY SERVICE PROVIDER RATINGS (COMMENTS)
     6) REPLY RATINGS (COMMENTS)
     7) VIEW HISTORY OF SERVICES CONTRACTED
    */

    /*
     HOME OWNER API´S ENDPOINTS:

     1) customer-management/customers/{customer-id}
     2) customer-management/customers/
     3) customer-management/customers/{customer-id}/address/
     4) customer-management/customers/{customer-id}/invoicing/{invoice-id}
    */

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/{customer-id}",
            method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public Customers findById(@PathVariable("id") String id) {
        return customerService.findById(id);
    }

    @RequestMapping(value="customer-management/customers/{customer-id}/address/{address_id}", method= RequestMethod.GET)
    public FullAddress fullAddress(@PathVariable("customer-id") String customerId, @PathVariable("address-id") String addressId) throws Exception {
        return new FullAddress();
    }

    @RequestMapping(value="customer-management/customers/{customer-id}/invoicing/{invoice-id}", method= RequestMethod.GET)
    public Payment payment(@PathVariable("customer-id") String customerId, @PathVariable("invoice-id") String invoiceId) throws Exception {
        return (Payment) new CreditCardPayment();
    }
}