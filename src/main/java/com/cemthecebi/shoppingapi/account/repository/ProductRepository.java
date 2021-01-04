package com.cemthecebi.shoppingapi.account.repository;

import com.cemthecebi.shoppingapi.account.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
