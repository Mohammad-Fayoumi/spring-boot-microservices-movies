package io.mfayoumi.ratingdataservice.dao;

import io.mfayoumi.ratingdataservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingDataRepository extends JpaRepository<Rating, String> {
}
