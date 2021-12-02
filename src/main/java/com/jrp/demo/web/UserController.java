package com.jrp.demo.web;

import com.jrp.demo.domain.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId) {
        return "User Found: " + userId;
    }

    @RequestMapping("/{id}/invoices")
    public String displayUserInvoices(@PathVariable(value = "id") int userId,
                                      @RequestParam(value = "d", required = false) Date dateOrNull) {
        return "Invoice found for user " + userId + " on the date " + dateOrNull;
    }

    @RequestMapping("/{id}/products_as_json")
    public Product displayProductsJson() {
        return new Product(1, "shoes", 42.99);
    }
}
