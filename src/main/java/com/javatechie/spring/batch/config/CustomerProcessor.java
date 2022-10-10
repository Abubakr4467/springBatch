package com.javatechie.spring.batch.config;
import com.javatechie.spring.batch.entity.Customer;
import javax.batch.api.chunk.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {


    @Override
    public Customer process(Customer customer) throws Exception{
        return customer;
    }


}
