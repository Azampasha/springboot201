package shopping.cart.api.service;

import shopping.cart.api.exception.RecordNotFoundException;
import shopping.cart.api.model.User;
/**
 * @author 
 *
 */
public interface UserService {
	
	User findOne(String email);
	User save(User user) throws RecordNotFoundException;

}
