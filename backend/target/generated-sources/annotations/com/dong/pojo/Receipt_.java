package com.dong.pojo;

import com.dong.pojo.Customer;
import com.dong.pojo.DetailReceipt;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Receipt.class)
public class Receipt_ { 

    public static volatile SingularAttribute<Receipt, Date> date;
    public static volatile SingularAttribute<Receipt, BigDecimal> total;
    public static volatile SingularAttribute<Receipt, Boolean> isPay;
    public static volatile CollectionAttribute<Receipt, DetailReceipt> detailReceiptCollection;
    public static volatile SingularAttribute<Receipt, Customer> customerId;
    public static volatile SingularAttribute<Receipt, Integer> id;

}