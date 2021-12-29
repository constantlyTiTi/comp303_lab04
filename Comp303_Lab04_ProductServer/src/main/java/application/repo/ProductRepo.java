package application.repo;

import org.springframework.data.repository.CrudRepository;

import application.bean.Product;


public interface ProductRepo  extends CrudRepository<Product, Long> {

}
