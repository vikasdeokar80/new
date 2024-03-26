package com.example.addressbookapp.model;



import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
public class BrokerProfile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int broker_id;
    @Column(nullable = false)
    public String name;
   @Column(nullable = false)
    public long docNumber;
    @Column(nullable = false)
    public String fullAddress ;
    @Column(nullable = false)
    public String city;


//    public BrokerProfile(BrokerDto brokerDto) {
//        this.id = brokerDto.id;
//        this.firstName = brokerDto.firstName;
//        this.lastName = brokerDto.lastName;
//        this.mobileNumber=brokerDto.mobileNumber;
//        this.propertyType=brokerDto.propertyType;
//    }
//    public BrokerProfile(int id, BrokerDto brokerDto) {
//        this.id = brokerDto.id;
//        this.firstName = brokerDto.firstName;
//        this.lastName = brokerDto.lastName;
//        this.mobileNumber=brokerDto.mobileNumber;
//        this.propertyType=brokerDto.propertyType;
//    }
//
//    public BrokerProfile() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public long getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setMobileNumber(long mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public String getPropertyType() {
//        return propertyType;
//    }
//
//    public void setPropertyType(String propertyType) {
//        this.propertyType = propertyType;
//    }
//
//    @Override
//    public String toString() {
//        return "BrokerProfile{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", mobileNumber=" + mobileNumber +
//                ", propertyType='" + propertyType + '\'' +
//                '}';
//    }
}
