package com.kodlayalim.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;



@Entity
@Table(name="vehicle")
@Getter
@Setter
public class Vehicle implements Serializable {
    @Id//zorunlu primarykey
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length=100,name = "vehicle_type")
    private String type;
    @Column(length=100,name = "model_code")
    private String modelCode;
    @Column(length=100,name = "brand_name")
    private String brandName;
    @Column(length=100,name = "launch_date")
    private Date launchDate;


}
