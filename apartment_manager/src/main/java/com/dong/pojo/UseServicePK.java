/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dong.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ASUS
 */
@Embeddable
public class UseServicePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;

    public UseServicePK() {
    }

    public UseServicePK(int customerId, int serviceId) {
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customerId;
        hash += (int) serviceId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UseServicePK)) {
            return false;
        }
        UseServicePK other = (UseServicePK) object;
        if (this.customerId != other.customerId) {
            return false;
        }
        if (this.serviceId != other.serviceId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dong.pojo.UseServicePK[ customerId=" + customerId + ", serviceId=" + serviceId + " ]";
    }
    
}
