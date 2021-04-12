package io.mfayoumi.moviecatalogservice.dao;

import io.mfayoumi.moviecatalogservice.entity.CatalogItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogItemRepository extends JpaRepository<CatalogItem, Integer> {
}
