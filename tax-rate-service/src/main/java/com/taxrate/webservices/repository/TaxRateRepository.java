package com.taxrate.webservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxrate.webservices.model.TaxRate;

public interface TaxRateRepository extends JpaRepository<TaxRate, Long> {

	List<TaxRate> findAll();

}
