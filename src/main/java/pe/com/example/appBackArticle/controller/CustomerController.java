package pe.com.example.appBackArticle.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.com.example.api.DefaultApi;
import pe.com.example.appBackArticle.entity.CustomerEntity;
import pe.com.example.appBackArticle.service.CustomerService;
import pe.com.example.model.Customer;

@RestController
public class CustomerController implements DefaultApi {

  private final CustomerService customerService;

  public CustomerController(final CustomerService customerService) {
    this.customerService = customerService;
  }

  @Override
  public ResponseEntity<List<Customer>> getCustomer() {
    final List<Customer> customerList = this.customerService.getAll();
    return ResponseEntity.ok(customerList);
  }

  @Override
  public ResponseEntity<List<Customer>> addCustomer(final Customer customer) {
    final CustomerEntity customerEntity = new CustomerEntity(customer.getName(), customer.getEmail(), customer.getPhone());
    this.customerService.addCustomer(customerEntity);
    final List<Customer> customerList = this.customerService.getAll();
    return ResponseEntity.ok(customerList);
  }
}
