package com.abilify.springbootrestapi.domain.homeservices;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="servicecategory")
public class ServiceCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "servicecategoryid")
    private long serviceCategoryId;

    @Column(name = "servicecategorydescription", nullable = false)
    private String serviceCategoryDescription;

    public ServiceCategory() {
        super();
    }

    public ServiceCategory(long id, String serviceCategoryDescription) {
        this.serviceCategoryId = id;
        this.serviceCategoryDescription = serviceCategoryDescription;
    }

    public long getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(long serviceId) {
        this.serviceCategoryId = serviceId;
    }

    public String getServiceCategoryDescription() {
        return serviceCategoryDescription;
    }

    public void setServiceCategoryDescription(String serviceDescription) {
        this.serviceCategoryDescription = serviceDescription;
    }

}

