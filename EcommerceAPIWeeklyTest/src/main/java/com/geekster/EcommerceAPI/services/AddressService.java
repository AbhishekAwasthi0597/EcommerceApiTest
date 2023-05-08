package com.geekster.EcommerceAPI.services;

import com.geekster.EcommerceAPI.models.Address;
import com.geekster.EcommerceAPI.models.Product;
import com.geekster.EcommerceAPI.models.Users;
import com.geekster.EcommerceAPI.repos.IAddressRepo;
import com.geekster.EcommerceAPI.repos.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;


    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address save ";
    }
}
