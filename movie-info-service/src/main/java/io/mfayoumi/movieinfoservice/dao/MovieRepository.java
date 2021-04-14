package io.mfayoumi.movieinfoservice.dao;

import io.mfayoumi.movieinfoservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
}
