package pe.com.example.appBackArticle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER", schema = "dbo")
public class CustomerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String email;

  private Long phone;

  public CustomerEntity() {
  }

  public CustomerEntity(final String name, final String email, final Long phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public Long getPhone() {
    return this.phone;
  }

  public void setPhone(final Long phone) {
    this.phone = phone;
  }
}
