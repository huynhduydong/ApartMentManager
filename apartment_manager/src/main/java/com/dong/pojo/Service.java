/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dong.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "service")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s"),
        @NamedQuery(name = "Service.findById", query = "SELECT s FROM Service s WHERE s.id = :id"),
        @NamedQuery(name = "Service.findByName", query = "SELECT s FROM Service s WHERE s.name = :name"),
        @NamedQuery(name = "Service.findByCost", query = "SELECT s FROM Service s WHERE s.cost = :cost")})
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 59)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cost")
    private BigDecimal cost;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "service")
    private Collection<DetailReceipt> detailReceiptCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "service")
    private Collection<UseService> useServiceCollection;

    public Service() {
    }

    public Service(Integer id) {
        this.id = id;
    }

    public Service(Integer id, String name, BigDecimal cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @XmlTransient
    public Collection<DetailReceipt> getDetailReceiptCollection() {
        return detailReceiptCollection;
    }

    public void setDetailReceiptCollection(Collection<DetailReceipt> detailReceiptCollection) {
        this.detailReceiptCollection = detailReceiptCollection;
    }

    @XmlTransient
    public Collection<UseService> getUseServiceCollection() {
        return useServiceCollection;
    }

    public void setUseServiceCollection(Collection<UseService> useServiceCollection) {
        this.useServiceCollection = useServiceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dong.pojo.Service[ id=" + id + " ]";
    }

}