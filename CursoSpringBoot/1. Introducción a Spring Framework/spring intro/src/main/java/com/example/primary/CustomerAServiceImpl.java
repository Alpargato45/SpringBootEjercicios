package com.example.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CustomerAServiceImpl implements CustomerService{
    @Override
    public String hello() {
        return "Hello From Customer A";
    }
}
