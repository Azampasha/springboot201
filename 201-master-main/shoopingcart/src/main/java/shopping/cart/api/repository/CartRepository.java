package shopping.cart.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import shopping.cart.api.model.Product;
/**
 * @author 
 *
 */
@Repository
public interface CartRepository extends JpaRepository<Product, Long> {

}
