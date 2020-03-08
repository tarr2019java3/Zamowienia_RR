package pl.sda.zamowienia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


    public class Main {
        public static void main(String[] args) throws NameProductException, AgeConsumerException, EmailException {

            Customer customer = new Customer("Witold", "Kowalski", 32, "kowal@gmail.com");
            customer.setName("WITOLD");
            customer.setSurname("KOWALSKI");
            customer.setAge(32);
            customer.setEmail("kowal@gmail.com");

            Product product1= new Product("Mleko","Nabiał",2.99);
            product1.setCategory("Nabiał");
            product1.setName("Mleko");
            product1.setPrice(2.99);



            System.out.println(product1.getName());

        }
    }
