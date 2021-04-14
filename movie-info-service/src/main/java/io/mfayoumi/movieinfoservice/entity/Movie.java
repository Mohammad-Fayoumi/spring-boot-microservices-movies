package io.mfayoumi.movieinfoservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
  @Id
  @Column(name = "movie_id")
  private String movieId;

  @Column(name = "name")
  private String name;

  public Movie(String movieId, String name) {
    this.movieId = movieId;
    this.name = name;
  }

  public Movie() {

  }

  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Movie{" +
            ", movieId='" + movieId + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
