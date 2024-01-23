package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var addressDTO = new AddressDTO("Main Street", "New York");
        var streets = List.of(new Street("Broadway"), new Street("Wall Street"), new Street("Fifth Avenue"));
        var address = new Address(streets, "New York");
        //var address = new Address(new Street("Broadway"), "New York");
        //var address = new Address("Broadway", "New York");

        var addressMapper = AddressMapper.INSTANCE;
        var updatedAddress = addressMapper.updateAddress(addressDTO, address);

        System.out.println(updatedAddress);
    }
}