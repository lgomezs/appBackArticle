package pe.com.example.appBackArticle.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.com.example.appBackArticle.entity.CustomerEntity;
import pe.com.example.appBackArticle.mapper.CustomerMapper;
import pe.com.example.appBackArticle.repository.CustomerRepository;
import pe.com.example.model.Customer;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository customerRepository;

  private final CustomerMapper customerMapper;

  public CustomerServiceImpl(final CustomerRepository customerRepository, final CustomerMapper customerMapper) {
    this.customerRepository = customerRepository;
    this.customerMapper = customerMapper;
  }

  @Override
  public List<Customer> getAll() {
    final List<CustomerEntity> customerEntityList = this.customerRepository.findAll();
    return this.customerMapper.asCustomer(customerEntityList);
  }

  @Override
  public void addCustomer(final CustomerEntity customer) {

    this.customerRepository.save(customer);
  }
}
