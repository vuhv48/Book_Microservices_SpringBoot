package com.microservice.product_service.service;

import com.microservice.product_service.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceImpl implements ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ServiceUtil serviceUtil;

    @Autowired
    public ProductServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Product getProduct(int productId) {
        LOG.debug("/product return the found product for productId={}", productId);
        if (productId < 1) {
            //throw new InvalidInputException("Invalid productId: " + productId);
            return null;
        }

        if (productId == 13) {
            //throw new NotFoundException("No product found for productId: " + productId);
            return null;
        }
//        Product product = new Product(1,"1",1,"11");
//        int productIdTest = product.getProductId();
//        System.out.println(productIdTest);

        return new Product(productId, "name-" + productId, 123, serviceUtil.getServiceAddress());
    }
}
