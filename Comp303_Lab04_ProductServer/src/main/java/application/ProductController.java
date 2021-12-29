package application;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.bean.Product;
import application.repo.ProductRepo;

@RestController
@RequestMapping("api/product")

public class ProductController {

	@Autowired
	private ProductRepo productRepo;

	@GetMapping("/")
	public Iterable<Product> index() {
		return productRepo.findAll();
	}
	
	@GetMapping("/{product_id}")
	public Optional<Product> getProductById(@PathVariable long product_id) {
		return productRepo.findById(product_id);
	}
	
	@DeleteMapping("/{product_id}")
	public void deleteProduct(@PathVariable long product_id) {
		productRepo.deleteById(product_id);
	}
	
	@PutMapping("/update-product")
	public void updateProduct(@RequestBody Product product) {
		productRepo.save(product);
	}
	
	@PostMapping("/post-product")
	public void postProduct(@RequestBody Product product) {
		productRepo.save(product);
	}
}
