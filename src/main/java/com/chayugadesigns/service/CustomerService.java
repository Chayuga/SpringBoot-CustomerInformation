package com.chayugadesigns.service;

import com.chayugadesigns.model.Customer;
import com.chayugadesigns.repository.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CustomerService {

    @Autowired
    private CustomerDTO cdto;

    String line = "";

    public void saveCustomerData()  {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/50-contacts.csv"));
            while ((line = br.readLine()) != null) {
                String [] data = line.split(",");
                Customer c = new Customer();

                c.setFirst_name(data[0]);
                c.setLast_name(data[1]);
                c.setCompany_name(data[2]);
                c.setAddress(data[3]);
                c.setCity(data[4]);
                c.setCounty(data[5]);
                c.setState(data[6]);
                c.setZip(data[7]);
                c.setPhone(data[8]);
                c.setEmail(data[9]);

                cdto.save(c);

            }
        } catch (IOException e){
            // TODO  Auto-generated catch block
            e.printStackTrace();
        }
    }
}
