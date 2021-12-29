package application;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import application.bean.ProductReview;

public interface ReviewRepo extends CrudRepository<ProductReview, Long> {

	@Query(value = "SELECT * FROM review r WHERE r.idproduct = ?1", nativeQuery = true)
	Optional<List<ProductReview>> findReviewsByProductId(Long productId);
	
	@Query(value = "SELECT * FROM review r WHERE r.idproduct = ?1 AND r.user_name = ?2", nativeQuery = true)
	Optional<ProductReview> findReviewByUserNameAndProductId(long product_id,String user_name);
}
