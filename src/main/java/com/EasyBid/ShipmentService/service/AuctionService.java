package com.EasyBid.ShipmentService.service;

import com.EasyBid.ShipmentService.entity.AuctionItem;

import java.util.List;

public interface AuctionService {

    AuctionItem save(AuctionItem item);

    List<AuctionItem> getAllItems();

    List<AuctionItem> getItemsByQuery(String query);

    AuctionItem getItemById(long itemId);

    boolean updateItem(long id, AuctionItem i);

    void deleteItem(long id);

    void deleteAllItems();
}
