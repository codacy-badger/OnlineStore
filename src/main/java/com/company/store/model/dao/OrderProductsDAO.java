package com.company.store.model.dao;

import com.company.store.model.entities.Order;
import com.company.store.model.entities.OrderProduct;
import com.company.store.model.entities.Product;

import java.util.Collection;

public interface OrderProductsDAO {

    Collection<OrderProduct> getOrderProductsById(int order_id);

    void saveProductToOrder(Product product, Order order, int amount, float price, boolean isUpdate);
    void removeProductFromOrder(int product_id, int order_id);
    void removeAllProductsFromOrder(int order_id);
}
