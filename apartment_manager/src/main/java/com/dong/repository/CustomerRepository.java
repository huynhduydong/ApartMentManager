package com.dong.repository;

import com.dong.pojo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerRepository {
    List<Customer>  getCustomer(Map<String, String> params);
    Long countCustomer();
    boolean addOrUpdateCustomer(Customer c);
    Customer getCustomerById(int id);
    boolean deleteCustomer(int id);
}
