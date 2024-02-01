package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class ShopIntegrationTest {

	@MockBean
	private ShopStorage shopStorage;
	@Autowired
	private ShopService shopService;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldAddProduct(){

		shopService.addProduct(10,"mleko");

		assertThat(shopStorage.getProductByName("mleko").get().getCost()).isEqualTo(10);

	}
	@Test
	void shouldOrderItems(){
		Client client =new Client(1,25);
		Cart cart = new Cart(client);
		cart.addItemToCart("mleko");
		cart.addItemToCart("mleko");
		cart.addItemToCart("piwo");
		shopService.orderItems(cart);

	}


}
