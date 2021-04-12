package io.mfayoumi.moviecatalogservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "catalog_item")
public class CatalogItem {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "rating")
  private int rating;

  public CatalogItem() {
  }

  public CatalogItem(int id, String name, String description, int rating) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String
  toString() {
    return "CatalogItem{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", rating=" + rating +
            '}';
  }
}
