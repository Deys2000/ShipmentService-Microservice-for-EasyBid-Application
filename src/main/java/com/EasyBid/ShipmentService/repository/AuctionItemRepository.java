package com.EasyBid.ShipmentService.repository;

import com.EasyBid.ShipmentService.entity.AuctionItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionItemRepository extends JpaRepository<AuctionItem, Long>{
}
