package com.codeaholicguy.demo.domain;

import com.codeaholicguy.demo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nguyennhathoang on 2/9/16.
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
