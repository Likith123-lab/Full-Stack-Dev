package com.gentech.dept.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "deptname")
    private String deptname;

    @Column(name = "cityname")
    private String cityname;

    @Column(name = "statename")
    private String statename;

    @Column(name = "pincode")
    private Long pincode;

    public Department() {
    }
    public Department(String deptname, String cityname, String statename, Long pincode) {
        this.deptname = deptname;
        this.cityname = cityname;
        this.statename = statename;
        this.pincode = pincode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }
}
