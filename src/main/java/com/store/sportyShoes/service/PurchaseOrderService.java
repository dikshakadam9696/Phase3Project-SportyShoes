package com.store.sportyShoes.service;

import java.util.List;

import com.store.sportyShoes.model.PurchaseOrder;

public interface PurchaseOrderService {
	

public PurchaseOrder getPurchaseById(long id);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
	
	public List<PurchaseOrder> getAllPurchaseOrderByUserId(Long userId);
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder);
}
