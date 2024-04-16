/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dong.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "use_service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UseService.findAll", query = "SELECT u FROM UseService u"),
    @NamedQuery(name = "UseService.findByDate", query = "SELECT u FROM UseService u WHERE u.date = :date"),
    @NamedQuery(name = "UseService.findByCustomerId", query = "SELECT u FROM UseService u WHERE u.useServicePK.customerId = :customerId"),
    @NamedQuery(name = "UseService.findByServiceId", query = "SELECT u FROM UseService u WHERE u.useServicePK.serviceId = :serviceId")})
public class UseService implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UseServicePK useServicePK;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "service_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Service service;

    public UseService() {
    }

    public UseService(UseServicePK useServicePK) {
        this.useServicePK = useServicePK;
    }

    public UseService(int customerId, int serviceId) {
        this.useServicePK = new UseServicePK(customerId, serviceId);
    }

    public UseServicePK getUseServicePK() {
        return useServicePK;
    }

    public void setUseServicePK(UseServicePK useServicePK) {
        this.useServicePK = useServicePK;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (useServicePK != null ? useServicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UseService)) {
            return false;
        }
        UseService other = (UseService) object;
        if ((this.useServicePK == null && other.useServicePK != null) || (this.useServicePK != null && !this.useServicePK.equals(other.useServicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dong.pojo.UseService[ useServicePK=" + useServicePK + " ]";
    }
    
}
