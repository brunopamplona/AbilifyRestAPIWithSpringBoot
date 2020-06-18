package com.abilify.springbootrestapi.domain.serviceproviders;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="coveredneighborhoods")

public class CoveredNeighborhoods implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "serviceproviderid")
    private  long serviceProviderId;

    @Column(name = "neighborid", nullable = false)
    private  String neighborId;

    @Column(name = "cityId", nullable = false)
    private  String cityId;


    public CoveredNeighborhoods()
    {
        super();
    }

    public CoveredNeighborhoods(long serviceProviderId, String neighborId, String cityId) {
        this.serviceProviderId = serviceProviderId;
        this.neighborId = neighborId;
        this.cityId = cityId;
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


}
