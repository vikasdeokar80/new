package com.example.addressbookapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BrokerDto {
    private int broker_id;
    private String name;
    private long docNumber;
    private String fullAddress;
    private String city;

    public BrokerDto(int broker_id, String name, long docNumber, String fullAddress, String city) {
        this.broker_id = broker_id;
        this.name = name;
        this.docNumber = docNumber;
        this.fullAddress = fullAddress;
        this.city = city;
    }
}
