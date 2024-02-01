package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ShopServiceTest {
    @Mock
    private ShopStorage shopStorage;
    @InjectMocks
    private ShopService shopService;

    @Test
    void shouldReturnTrue() {
        // GIVEN
        String productName = "milk";
        when(shopStorage.getProductByName(productName)).thenReturn(Optional.empty());
        // WHEN
        boolean result = shopService.productDoesNotExist(productName);
        // THEN
        assertThat(result).isEqualTo(true);
    }

    @Test
    void shouldReturnFalse() {
        // GIVEN
        String productName = "milk";
        when(shopStorage.getProductByName(productName)).thenReturn(Optional.of(new Product(productName,12)));
        // WHEN
        boolean result = shopService.productDoesNotExist(productName);
        // THEN
        assertThat(result).isEqualTo(false);
    }
}