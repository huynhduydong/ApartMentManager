/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dong.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "detail_receipt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetailReceipt.findAll", query = "SELECT d FROM DetailReceipt d"),
    @NamedQuery(name = "DetailReceipt.findByCost", query = "SELECT d FROM DetailReceipt d WHERE d.cost = :cost"),
    @NamedQuery(name = "DetailReceipt.findByReceiptId", query = "SELECT d FROM DetailReceipt d WHERE d.detailReceiptPK.receiptId = :receiptId"),
    @NamedQuery(name = "DetailReceipt.findByServiceId", query = "SELECT d FROM DetailReceipt d WHERE d.detailReceiptPK.serviceId = :serviceId")})
public class DetailReceipt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetailReceiptPK detailReceiptPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cost")
    private BigDecimal cost;
    @JoinColumn(name = "receipt_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Receipt receipt;
    @JoinColumn(name = "service_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Service service;

    public DetailReceipt() {
    }

    public DetailReceipt(DetailReceiptPK detailReceiptPK) {
        this.detailReceiptPK = detailReceiptPK;
    }

    public DetailReceipt(DetailReceiptPK detailReceiptPK, BigDecimal cost) {
        this.detailReceiptPK = detailReceiptPK;
        this.cost = cost;
    }

    public DetailReceipt(int receiptId, int serviceId) {
        this.detailReceiptPK = new DetailReceiptPK(receiptId, serviceId);
    }

    public DetailReceiptPK getDetailReceiptPK() {
        return detailReceiptPK;
    }

    public void setDetailReceiptPK(DetailReceiptPK detailReceiptPK) {
        this.detailReceiptPK = detailReceiptPK;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
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
        hash += (detailReceiptPK != null ? detailReceiptPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailReceipt)) {
            return false;
        }
        DetailReceipt other = (DetailReceipt) object;
        if ((this.detailReceiptPK == null && other.detailReceiptPK != null) || (this.detailReceiptPK != null && !this.detailReceiptPK.equals(other.detailReceiptPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dong.pojo.DetailReceipt[ detailReceiptPK=" + detailReceiptPK + " ]";
    }
    
}
