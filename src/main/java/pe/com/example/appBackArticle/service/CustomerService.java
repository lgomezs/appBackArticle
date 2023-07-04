package pe.com.example.appBackArticle.service;

import java.util.List;

import pe.com.example.appBackArticle.entity.CustomerEntity;
import pe.com.example.model.Customer;

public interface CustomerService {

  List<Customer> getAll();

  void addCustomer(final CustomerEntity customer);
}
