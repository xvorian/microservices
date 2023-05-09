package com.example.sakila.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "store")
public class Store implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "store_id", columnDefinition = "TINYINT")
    private Integer storeId;

    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "manager_staff_id", columnDefinition = "TINYINT")
    private Integer managerStaffId;

    @Type(type = "org.hibernate.type.IntegerType")
    @Column(name = "address_id", columnDefinition = "SMALLINT")
    private Integer addressId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getManagerStaffId() {
        return this.managerStaffId;
    }

    public void setManagerStaffId(Integer managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
