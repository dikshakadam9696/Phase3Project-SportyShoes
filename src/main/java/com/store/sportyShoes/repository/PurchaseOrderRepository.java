package com.store.sportyShoes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.store.sportyShoes.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
	

}
