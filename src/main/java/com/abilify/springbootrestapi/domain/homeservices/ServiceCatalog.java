package com.abilify.springbootrestapi.domain.homeservices;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="servicecatalog")
public class ServiceCatalog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "serviceid")
    private  long serviceId;

    @Column(name = "servicedescription", nullable = false)
    private  String serviceDescription;

    @Column(name = "servicedefaultprice", nullable = false)
    private  String serviceDefaultPrice;

    @Column(name = "servicecategoryid", nullable = false)
    private  long serviceCategoryId;

    public ServiceCatalog()
    {
        super();
    }

    public ServiceCatalog(long serviceId, String serviceDescription, String serviceDefaultPrice, long serviceCategoryId) {
        this.serviceId = serviceId;
        this.serviceDescription = serviceDescription;
        this.serviceDefaultPrice = serviceDefaultPrice;
        this.serviceCategoryId = serviceCategoryId;

    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceDefaultPrice() {
        return serviceDefaultPrice;
    }

    public void setServiceDefaultPrice(String serviceDefaultPrice) {
        this.serviceDefaultPrice = serviceDefaultPrice;
    }

    public long getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(long serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }
}

