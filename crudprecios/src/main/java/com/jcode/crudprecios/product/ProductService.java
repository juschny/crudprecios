package com.jcode.crudprecios.product;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        return List.of(
                new Product(
                        11231L,
                        "laptop",
                        100,
                        LocalDate.of(2023, Month.APRIL, 15),
                        1
                ));
    }


}
