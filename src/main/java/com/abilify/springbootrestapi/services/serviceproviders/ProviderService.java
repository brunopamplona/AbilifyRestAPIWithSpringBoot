package com.abilify.springbootrestapi.services.serviceproviders;

import com.abilify.springbootrestapi.domain.serviceproviders.CoveredNeighborhoods;
import com.abilify.springbootrestapi.domain.serviceproviders.CoveredServices;
import com.abilify.springbootrestapi.domain.serviceproviders.ServiceProviders;
import com.abilify.springbootrestapi.infrastructure.serviceproviders.CoveredServicesRepository;
import com.abilify.springbootrestapi.infrastructure.serviceproviders.NeighborhoodsRepository;
import com.abilify.springbootrestapi.infrastructure.serviceproviders.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProviderService {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    ProviderRepository repository;

    @Autowired
    NeighborhoodsRepository NeighborRepository;

    @Autowired
    CoveredServicesRepository CoveredServicesRepository;


    //*************************************************************************
    //**  CRUD::PROVIDERS
    //*************************************************************************

    public ServiceProviders createProvider(ServiceProviders provider)
    {
        if (provider != null)
        {
            return repository.save(provider);
        }
        else
        {
            return null;
        }
    }

    public ServiceProviders updateProvider(ServiceProviders provider)
    {
        if (provider != null)
        {
            Optional<ServiceProviders> entity = repository.findById(provider.getServiceProviderId());

            ServiceProviders sp = entity.get();

            sp.setFirstName(provider.getFirstName());
            sp.setLastName(provider.getLastName());
            sp.setUserName(provider.getUserName());
            sp.setEmail(provider.getEmail());
            sp.setCellPhone(provider.getCellPhone());
            sp.setPassWord(provider.getPassWord());
            sp.setCity(provider.getCity());
            sp.setCnpj(provider.getCnpj());
            sp.setCpf(provider.getCpf());
            sp.setProfessionDescription(provider.getProfessionDescription());
            sp.setPhotoId(provider.getPhotoId());

            return repository.save(sp);
        }
        else
        {
            return null;
        }
    }

    public void deleteProvider(String id)
    {
        Optional<ServiceProviders> entity = repository.findById(Long.parseLong(id));

        ServiceProviders sp = entity.get();

        repository.delete(sp);
    }

    public ServiceProviders findById(String id)
    {
        Optional<ServiceProviders> entity = repository.findById(Long.parseLong(id));
        return entity.get();
    }

    public List<ServiceProviders> findAll()
    {
        List<ServiceProviders> entity = repository.findAll();
        return entity;
    }

    //*************************************************************************
    //**  CRUD::COVERED-NEIGHBORHOODS
    //*************************************************************************

    public CoveredNeighborhoods createNeighborhoods(CoveredNeighborhoods neighborhoods)
    {
        if (neighborhoods != null)
        {
            return NeighborRepository.save(neighborhoods);
        }
        else
        {
            return null;
        }
    }

    public CoveredNeighborhoods updateNeighborhoods(CoveredNeighborhoods neighborhood)
    {
        if (neighborhood != null)
        {
            Optional<CoveredNeighborhoods> entity = NeighborRepository.findById(Long.parseLong(neighborhood.getNeighborId()));

            CoveredNeighborhoods cn = entity.get();

            cn.setCityId(neighborhood.getCityId());
            cn.setNeighborId(neighborhood.getNeighborId());
            cn.setServiceProviderId(neighborhood.getServiceProviderId());

            return NeighborRepository.save(cn);
        }
        else
        {
            return null;
        }
    }

    public void deleteNeighborhoods(String id)
    {
        Optional<CoveredNeighborhoods> entity = NeighborRepository.findById(Long.parseLong(id));

        CoveredNeighborhoods cn = entity.get();

        NeighborRepository.delete(cn);
    }

    public CoveredNeighborhoods NeighborFindById(String id)
    {
        Optional<CoveredNeighborhoods> entity = NeighborRepository.findById(Long.parseLong(id));
        return entity.get();
    }

    public List<CoveredNeighborhoods> NeighborFindAll()
    {
        List<CoveredNeighborhoods> entity = NeighborRepository.findAll();
        return entity;
    }

    //*************************************************************************
    //**  CRUD::COVERED-SERVICES
    //*************************************************************************

    public CoveredServices createCoveredServices(CoveredServices coveredServices)
    {
        if (coveredServices != null)
        {
            return CoveredServicesRepository.save(coveredServices);
        }
        else
        {
            return null;
        }
    }

    public CoveredServices updateCoveredServices(CoveredServices coveredServices)
    {
        if (coveredServices != null)
        {
            Optional<CoveredServices> entity = CoveredServicesRepository.findById(Long.parseLong(coveredServices.getServiceId()));

            CoveredServices cs = entity.get();

            cs.setCityId(coveredServices.getCityId());
            cs.setNeighborId(coveredServices.getNeighborId());
            cs.setServiceProviderId(coveredServices.getServiceProviderId());

            return CoveredServicesRepository.save(cs);
        }
        else
        {
            return null;
        }
    }

    public void deleteCoveredServices(String id)
    {
        Optional<CoveredServices> entity = CoveredServicesRepository.findById(Long.parseLong(id));

        CoveredServices cs = entity.get();

        CoveredServicesRepository.delete(cs);
    }

    public CoveredServices CoveredServicesFindById(String id)
    {
        Optional<CoveredServices> entity = CoveredServicesRepository.findById(Long.parseLong(id));
        return entity.get();
    }

    public List<CoveredServices> CoveredServicesFindAll()
    {
        List<CoveredServices> entity = CoveredServicesRepository.findAll();
        return entity;
    }

    //*************************************************************************
    //**  CRUD::BANK-ACCOUNT
    //*************************************************************************

    //*************************************************************************
    //**  CRUD::SCORES/RATTINGS
    //*************************************************************************


}