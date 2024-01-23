package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
class Address {
    //private String street;
    //private Street street;
    private List<Street> streets;
    private String city;
}