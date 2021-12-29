package application;

import java.util.List;
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

import application.bean.*;

@RestController
@RequestMapping("api/review")
public class ReviewController {
	@Autowired
	private ReviewRepo reviewRepo;
	
	@GetMapping("/{product_id}")
	 public Optional<List<ProductReview>> getAllReviews(@PathVariable long product_id){
		 return reviewRepo.findReviewsByProductId(product_id);
	 }
	 
	 @GetMapping("/{product_id}/{user_name}")
	 public Optional<ProductReview> getUserReview(@PathVariable long product_id,@PathVariable String user_name) {
		 return reviewRepo.findReviewByUserNameAndProductId(product_id, user_name);
	 }
	 
	 @PostMapping("post-review/{product_id}")
	 public ProductReview createReview(@RequestBody ProductReview review, @PathVariable long product_id) {
//		 review.set_productId(product_id);
		 reviewRepo.save(review);
		 return review;
	 }
	 
	 @DeleteMapping("/{review_id}")
	 public void deleteReview(@PathVariable long review_id) {
		 reviewRepo.deleteById(review_id);
	 }
	 
	 @PutMapping("/{review_id}")
	 public void updateReview(@RequestBody ProductReview review) {
		 reviewRepo.save(review);
	 }

}
