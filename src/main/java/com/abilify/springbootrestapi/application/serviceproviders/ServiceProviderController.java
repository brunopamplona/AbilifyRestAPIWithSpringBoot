package com.abilify.springbootrestapi.application.serviceproviders;

import com.abilify.springbootrestapi.domain.serviceproviders.CoveredNeighborhoods;
import com.abilify.springbootrestapi.domain.serviceproviders.CoveredServices;
import com.abilify.springbootrestapi.domain.serviceproviders.ServiceProviders;
import com.abilify.springbootrestapi.services.serviceproviders.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-provider-management")
public class ServiceProviderController {

    /*
     SERVICE PROVIDER DOMAIN:

     1) REGISTER AS SERVICE PROVIDER
     2) LOG-IN AS SERVICE PROVIDER
     3) FILL ACCOUNT SERVICE PROVIDER DETAILS (BANK ACCOUNT INFO, SERVICES PROVIDED, COVERED NEIGHBOURHOOD, ETC)
     4) EDIT OR DELETE SERVICE PROVIDER ACCOUNT DETAILS
     5) VIEW SERVICE PROVIDER OVERALL SCORE AND THEIR SERVICE RATINGS (COMMENTS)
     6) REPLY RATINGS (COMMENTS)
     7) VIEW HISTORY OF SERVICES PROVIDED
    */

    /*
     SERVICE PROVIDER API´S ENDPOINTS:

     CRUD::PROVIDERS

        1) service-provider-management/providers/{professional-id}
        2) service-provider-management/providers/

     CRUD::NEIGHBORHOODS

        3) service-provider-management/providers/{professional-id}/neighborhoods/{list-id}

     CRUD::SERVICES

        4) service-provider-management/providers/{professional-id}/services/{list-id}

     CRUD::BANK-ACCOUNT

        5) service-provider-management/providers/{professional-id}/account/{account-id}

     CRUD::SCORES/RATTINGS

        6) service-provider-management/providers/{professional-id}/scores/{score-id}
        7) service-provider-management/providers/{professional-id}/orders/{order-id}/ratings/{rating-id}

     CRUD::SERVICE-BIDs

        8) service-provider-management/providers/{professional-id}/orders/{order-id}/bidding/{bid-id}
    */

    @EnableWebSecurity
    @Configuration
    @EnableGlobalMethodSecurity(prePostEnabled = true)

    public class SecurityConfig extends WebSecurityConfigurerAdapter {


        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
        }
    }

    @Autowired
   private ProviderService providerService;

    //*************************************************************************
    //**  GROUP-METHODS::AUTHENTICATION & AUTHORIZATION
    //*************************************************************************

    // REGISTER ONE SERVICE PROVIDER ACCOUNT
    @RequestMapping(value="/register-provider/",
            method= RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ServiceProviders registerProvider(@RequestBody ServiceProviders provider)
    {
        return providerService.createProvider(provider);
    }

    // SIGN-IN ONE SERVICE PROVIDER ON THE PLATFORM
    @RequestMapping(value="/sign-in-provider/",
            method= RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ServiceProviders signInProvider(@RequestBody ServiceProviders provider)
    {
        return null;
    }

    // SIGN-OUT ONE SERVICE PROVIDER ON THE PLATFORM
    @RequestMapping(value="/sign-out-provider/",
            method= RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ServiceProviders signOutProvider(@RequestBody ServiceProviders provider)
    {
        return null;
    }

    // DELETE ONE SERVICE PROVIDER ACCOUNT
    @RequestMapping(value="/delete-provider/{id}",
            method= RequestMethod.DELETE)
    public void deleteProvider(@PathVariable("id") String id)
    {
        providerService.deleteProvider(id);
    }


    //*************************************************************************
    //**  CRUD::PROVIDERS PROFILE
    //*************************************************************************

    // FIND ALL SERVICE PROVIDERS PROFILE
    @RequestMapping(value="/providers/", method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public List<ServiceProviders> findAll()
    {
        return providerService.findAll(); }

    // FIND ONE SERVICE PROVIDER PROFILE
    @RequestMapping(value="/providers/{id}",
                    method= RequestMethod.GET,
                    produces= MediaType.APPLICATION_JSON_VALUE)
    public ServiceProviders findById(@PathVariable("id") String id)
    {
        return providerService.findById(id);
    }

   // CREATE ONE SERVICE PROVIDER PROFILE
   @RequestMapping(value="/providers/",
           method= RequestMethod.POST,
           consumes= MediaType.APPLICATION_JSON_VALUE,
           produces= MediaType.APPLICATION_JSON_VALUE)
   public ServiceProviders createProvider(@RequestBody ServiceProviders provider)
   {
       return providerService.createProvider(provider);
   }

    // UPDATE ONE SERVICE PROVIDER PROFILE
   @RequestMapping(value="/providers/",
           method= RequestMethod.PUT,
           consumes= MediaType.APPLICATION_JSON_VALUE,
           produces= MediaType.APPLICATION_JSON_VALUE)
   public ServiceProviders updateProvider(@RequestBody ServiceProviders provider)
   {
       return providerService.updateProvider(provider);
   }

   // DELETE ONE SERVICE PROVIDER PROFILE
   @RequestMapping(value="/providers/{id}",
           method= RequestMethod.DELETE)
   public void removeProvider(@PathVariable("id") String id)
   {
        providerService.deleteProvider(id);
   }

    //*************************************************************************
    //**  CRUD::COVERED-NEIGHBORHOODS
    //*************************************************************************

    // FIND ALL NEIGHBORHOODS
    @RequestMapping(value="/neighborhoods/",
            method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public List<CoveredNeighborhoods> neighborFindAll()
    {
        return providerService.NeighborFindAll(); }

    // FIND ONE NEIGHBORHOOD
    @RequestMapping(value="/neighborhoods/{id}",
            method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public CoveredNeighborhoods neighborFindById(@PathVariable("id") String id)
    {
        return providerService.NeighborFindById(id);
    }

    // CREATE ONE NEIGHBORHOOD
    @RequestMapping(value="/neighborhoods/",
            method= RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public CoveredNeighborhoods createNeighborhood(@RequestBody CoveredNeighborhoods neighborhoods)
    {
        return providerService.createNeighborhoods(neighborhoods);
    }

    // UPDATE ONE NEIGHBORHOOD
    @RequestMapping(value="/neighborhoods/",
            method= RequestMethod.PUT,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public CoveredNeighborhoods updateNeighborhood(@RequestBody CoveredNeighborhoods neighborhoods)
    {
        return providerService.updateNeighborhoods(neighborhoods);
    }

    // DELETE ONE NEIGHBORHOOD
    @RequestMapping(value="/neighborhoods/{id}",
            method= RequestMethod.DELETE)
    public void deleteNeighborhood(@PathVariable("id") String id)
    {
        providerService.deleteNeighborhoods(id);
    }

    //*************************************************************************
    //**  CRUD::COVERED-SERVICES
    //*************************************************************************

    // FIND ALL COVERED SERVICES
    @RequestMapping(value="/services/",
            method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public List<CoveredServices> coveredServicesFindAll()
    {
        return providerService.CoveredServicesFindAll(); }

    // FIND ONE COVERED SERVICE
    @RequestMapping(value="/services/{id}",
            method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public CoveredServices coveredServicesFindById(@PathVariable("id") String id)
    {
        return providerService.CoveredServicesFindById(id);
    }

    // CREATE ONE COVERED SERVICE
    @RequestMapping(value="/services/",
            method= RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public CoveredServices createCoveredServices(@RequestBody CoveredServices services)
    {
        return providerService.createCoveredServices(services);
    }

    // UPDATE ONE COVERED SERVICE
    @RequestMapping(value="/services/",
            method= RequestMethod.PUT,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public CoveredServices updateCoveredServices(@RequestBody CoveredServices services)
    {
        return providerService.updateCoveredServices(services);
    }

    // DELETE ONE COVERED SERVICE
    @RequestMapping(value="/services/{id}",
            method= RequestMethod.DELETE)
    public void deleteCoveredServices(@PathVariable("id") String id)
    {
        providerService.deleteCoveredServices(id);
    }

    //*************************************************************************
    //**  CRUD::BANK-ACCOUNT
    //*************************************************************************

    // TO-DO

    //*************************************************************************
    //**   CRUD::SCORES/RATTINGS
    //*************************************************************************

    // TO-DO

}