package com.abilify.springbootrestapi.infrastructure.serviceproviders;

import com.abilify.springbootrestapi.domain.serviceproviders.CoveredNeighborhoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeighborhoodsRepository extends JpaRepository<CoveredNeighborhoods, Long> {
}
