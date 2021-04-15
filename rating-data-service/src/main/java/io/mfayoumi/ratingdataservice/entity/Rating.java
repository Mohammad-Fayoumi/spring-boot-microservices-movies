package io.mfayoumi.ratingdataservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating {

  @Id
  @Column(name = "movie_id")
  private String movieId;

  @Column(name = "rating")
  private double rating;

  public Rating() {}

  public Rating(String movieId, double rating) {
    this.movieId = movieId;
    this.rating = rating;
  }

  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Rating{" +
            "movieId='" + movieId + '\'' +
            ", rating=" + rating +
            '}';
  }
}
