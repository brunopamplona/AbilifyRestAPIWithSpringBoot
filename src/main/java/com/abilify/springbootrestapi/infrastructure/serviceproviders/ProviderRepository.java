package com.abilify.springbootrestapi.infrastructure.serviceproviders;

import com.abilify.springbootrestapi.domain.serviceproviders.ServiceProviders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<ServiceProviders, Long> {
}
