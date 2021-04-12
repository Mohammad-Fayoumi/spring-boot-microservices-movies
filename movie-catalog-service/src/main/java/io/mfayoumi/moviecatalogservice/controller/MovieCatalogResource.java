package io.mfayoumi.moviecatalogservice.controller;

import io.mfayoumi.moviecatalogservice.entity.CatalogItem;
import io.mfayoumi.moviecatalogservice.dao.CatalogItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog-items")
public class MovieCatalogResource {

  @Autowired
  private CatalogItemRepository catalogItemRepository;

  Logger logger = LoggerFactory.getLogger(CatalogItem.class);

  @GetMapping("/{userId}")
  public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
    logger.trace("All catalogs by user id.");
    return catalogItemRepository.findAll();
  }
}
