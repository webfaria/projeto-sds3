package com.webfaria.desvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webfaria.desvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
