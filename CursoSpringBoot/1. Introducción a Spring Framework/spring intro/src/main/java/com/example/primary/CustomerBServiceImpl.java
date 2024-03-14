package com.example.primary;

import org.springframework.stereotype.Service;

@Service
public class CustomerBServiceImpl implements CustomerService{
    @Override
    public String hello() {
        return "Hello From Customer B";
    }
}
