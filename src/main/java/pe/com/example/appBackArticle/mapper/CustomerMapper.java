package pe.com.example.appBackArticle.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import pe.com.example.appBackArticle.entity.CustomerEntity;
import pe.com.example.model.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  List<Customer> asCustomer(List<CustomerEntity> customerEntityList);
}
