package com.company.as.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;

@Table(name = "AS_PRODUCT")
@Entity(name = "as$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 4407021383212797160L;

    @Column(name = "BRAND")
    protected String brand;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "ALIAS")
    protected String alias;

    @Column(name = "MULTIPLICITY")
    protected Double multiplicity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setMultiplicity(Double multiplicity) {
        this.multiplicity = multiplicity;
    }

    public Double getMultiplicity() {
        return multiplicity;
    }


}