package com.eadp.pos.system.api;

import com.eadp.pos.system.dto.request.CustomerRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String saveCustomer(@RequestBody CustomerRequestDto dto) {

        return dto.toString();
    }

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable("id") String  customerId){
        return customerId;
    }
    @PutMapping("/{id}")
    public String updateCustomer(
            @PathVariable("id") String  customerId, @RequestBody CustomerRequestDto dto){
        return "update customer"+customerId+dto.toString();
    }
    @DeleteMapping ("/{id}")
    public String deleteCustomer(@PathVariable("id" )String customerId){
        return "delete customer"+customerId;
    }
    @GetMapping("/list")
    public String getAllCustomers(
            @RequestParam String searchText,
            @RequestParam String page,
            @RequestParam String pageSize
    ){
        return "get all customers";
    }


}
