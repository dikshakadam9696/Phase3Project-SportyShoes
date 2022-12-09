package com.store.sportyShoes.service;

import java.util.List;

import com.store.sportyShoes.model.PurchaseItem;
import com.store.sportyShoes.model.PurchaseOrder;
import com.store.sportyShoes.model.User;

public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
