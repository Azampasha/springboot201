package shopping.cart.api.service;

import shopping.cart.api.model.Apparel;
/**
 * @author 
 *
 */
public interface ApparelService {

	Apparel addProduct(Apparel apparel) throws Exception;

	Apparel updateProduct(Apparel apparel, long product) throws Exception;

}
