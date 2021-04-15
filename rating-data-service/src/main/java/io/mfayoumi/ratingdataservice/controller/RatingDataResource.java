package io.mfayoumi.ratingdataservice.controller;

import io.mfayoumi.ratingdataservice.dao.RatingDataRepository;
import io.mfayoumi.ratingdataservice.entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/rating-data")
public class RatingDataResource {
  @Autowired
  RatingDataRepository ratingDataRepository;

  @GetMapping(value = "/{movieId}")
  public Optional<Rating> getRating(@PathVariable String movieId) {
    return ratingDataRepository.findById(movieId);
  }
}
