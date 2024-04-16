/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dong.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "merchandise_cabinet_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MerchandiseCabinetDetail.findAll", query = "SELECT m FROM MerchandiseCabinetDetail m"),
    @NamedQuery(name = "MerchandiseCabinetDetail.findById", query = "SELECT m FROM MerchandiseCabinetDetail m WHERE m.id = :id"),
    @NamedQuery(name = "MerchandiseCabinetDetail.findByStatus", query = "SELECT m FROM MerchandiseCabinetDetail m WHERE m.status = :status"),
    @NamedQuery(name = "MerchandiseCabinetDetail.findByTime", query = "SELECT m FROM MerchandiseCabinetDetail m WHERE m.time = :time"),
    @NamedQuery(name = "MerchandiseCabinetDetail.findByName", query = "SELECT m FROM MerchandiseCabinetDetail m WHERE m.name = :name")})
public class MerchandiseCabinetDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @Size(max = 50)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne
    private Customer customerId;

    public MerchandiseCabinetDetail() {
    }

    public MerchandiseCabinetDetail(Integer id) {
        this.id = id;
    }

    public MerchandiseCabinetDetail(Integer id, Date time) {
        this.id = id;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
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
        if (!(object instanceof MerchandiseCabinetDetail)) {
            return false;
        }
        MerchandiseCabinetDetail other = (MerchandiseCabinetDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dong.pojo.MerchandiseCabinetDetail[ id=" + id + " ]";
    }
    
}
