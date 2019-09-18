package onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineShop.dao.CartItemDao;
import onlineShop.model.Cart;
import onlineShop.model.CartItem;

@Service
public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	private CartItemDao CartItemDao;

	@Override
	public void addCartItem(CartItem cartItem) {
		CartItemDao.addCartItem(cartItem);
	}

	@Override
	public void removeCartItem(int CartItemId) {
		CartItemDao.removeCartItem(CartItemId);
	}

	@Override
	public void removeAllCartItems(Cart cart) {
		CartItemDao.removeAllCartItems(cart);
	}
}
