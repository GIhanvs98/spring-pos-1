package com.eadp.pos.systen.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String saveCustomer(){
        return "save success";
    }
    @GetMapping
    public String getCustomer(){
        return "get customer()";
    }
    @PutMapping
    public String updateCustomer(){
        return "update customer";
    }
    @DeleteMapping
    public String deleteCustomer(){
        return "delete customer";
    }
    @GetMapping("/list")
    public String getAllCustomers(){
        return "get all customers";
    }


}
