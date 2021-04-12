package io.mfayoumi.moviecatalogservice.dao;

import io.mfayoumi.moviecatalogservice.entity.CatalogItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CatalogItemRepository extends JpaRepository<CatalogItem, Integer> {
}
