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
public class DetailReceiptPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "receipt_id")
    private int receiptId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;

    public DetailReceiptPK() {
    }

    public DetailReceiptPK(int receiptId, int serviceId) {
        this.receiptId = receiptId;
        this.serviceId = serviceId;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
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
        hash += (int) receiptId;
        hash += (int) serviceId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailReceiptPK)) {
            return false;
        }
        DetailReceiptPK other = (DetailReceiptPK) object;
        if (this.receiptId != other.receiptId) {
            return false;
        }
        if (this.serviceId != other.serviceId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dong.pojo.DetailReceiptPK[ receiptId=" + receiptId + ", serviceId=" + serviceId + " ]";
    }
    
}
