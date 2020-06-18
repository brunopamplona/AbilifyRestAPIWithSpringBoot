package com.abilify.springbootrestapi.infrastructure.serviceproviders;

import com.abilify.springbootrestapi.domain.serviceproviders.CoveredServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoveredServicesRepository extends JpaRepository<CoveredServices, Long> {
}
