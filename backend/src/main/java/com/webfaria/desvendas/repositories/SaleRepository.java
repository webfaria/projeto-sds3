package com.webfaria.desvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webfaria.desvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
