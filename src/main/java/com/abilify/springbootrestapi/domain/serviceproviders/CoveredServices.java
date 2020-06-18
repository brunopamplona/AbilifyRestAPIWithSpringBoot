package com.abilify.springbootrestapi.domain.serviceproviders;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="coveredservices")
public class CoveredServices implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "serviceproviderid")
    private  long serviceProviderId;

    @Column(name = "neighborid", nullable = false)
    private  String neighborId;

    @Column(name = "cityId", nullable = false)
    private  String cityId;

    @Column(name = "serviceid", nullable = false)
    private  String serviceId;

    @Column(name = "servicecategoryid", nullable = false)
    private  String serviceCategoryId;

    public CoveredServices()
    {
        super();
    }

    public CoveredServices(long serviceProviderId, String neighborId, String cityId, String serviceId, String serviceCategoryId) {
        this.serviceProviderId = serviceProviderId;
        this.neighborId = neighborId;
        this.cityId = cityId;
        this.serviceId = serviceId;
        this.serviceCategoryId = serviceCategoryId;
    }

    public long getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(long serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getNeighborId() {
        return neighborId;
    }

    public void setNeighborId(String neighborId) {
        this.neighborId = neighborId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(String serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

}

