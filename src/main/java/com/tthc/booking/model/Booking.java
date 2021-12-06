package com.tthc.booking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String fullName;
    private String userAddress;
    private String identityCard ;
    private String tenThuTuc ;
    private String maSo ;
    private String state ;

    protected Booking() {}

    public Booking(String fullName, String userAddress, String identityCard, String tenThuTuc, String maSo, String state) {
        this.fullName = fullName;
        this.userAddress = userAddress;
        this.identityCard = identityCard;
        this.tenThuTuc = tenThuTuc;
        this.maSo = maSo;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTenThuTuc() {
        return tenThuTuc;
    }

    public void setTenThuTuc(String tenThuTuc) {
        this.tenThuTuc = tenThuTuc;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", tenThuTuc='" + tenThuTuc + '\'' +
                ", maSo='" + maSo + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
