package com.odirleikempfer.kmpx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odirleikempfer.kmpx.entities.Sale;
import com.odirleikempfer.kmpx.repositories.SaleRepository;

@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
