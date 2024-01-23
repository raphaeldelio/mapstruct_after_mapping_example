package org.example;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;


@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    //@Mapping(source = "street", target = "street.street")
    Address updateAddress(AddressDTO addressDTO, @MappingTarget Address address);

    @AfterMapping
    default void updateStreets(AddressDTO addressDTO, @MappingTarget Address address) {
        address.getStreets().forEach(street -> street.setStreet(addressDTO.getStreet()));
    }
}
