package com.learning.jpa.hibernate.jpademo.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class PartTimeEmployee extends Employee{

    protected PartTimeEmployee(){}
    public PartTimeEmployee(String name, BigDecimal hourlyWage){
        super(name);
        this.hourlyWage =hourlyWage;
    }

    private BigDecimal hourlyWage;

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyWage=" + hourlyWage +
                '}';
    }
}
