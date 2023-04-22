package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int driverId;
    private String mobile;
    private String password;


    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    Cab cab;

    public Driver() {
    }

    public Driver(int driverId, String mobile, String password, List<TripBooking> tripBookingList, Cab cab) {
        this.driverId = driverId;
        this.mobile = mobile;
        this.password = password;
        this.tripBookingList = tripBookingList;
        this.cab = cab;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }
}
