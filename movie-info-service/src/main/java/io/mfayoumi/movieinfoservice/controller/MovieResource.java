package io.mfayoumi.movieinfoservice.controller;

import io.mfayoumi.movieinfoservice.dao.MovieRepository;
import io.mfayoumi.movieinfoservice.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/movies/infos")
public class MovieResource {

  @Autowired
  MovieRepository movieRepository;

  @GetMapping(value = "/{movieId}")
  public Optional<Movie> getMovie(@PathVariable String movieId) {
    return movieRepository.findById(movieId);
  }
}
