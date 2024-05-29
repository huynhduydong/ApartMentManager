package com.dong.pojo;

import com.dong.pojo.Receipt;
import com.dong.pojo.Service;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetailReceipt.class)
public class DetailReceipt_ { 

    public static volatile SingularAttribute<DetailReceipt, Float> quantity;
    public static volatile SingularAttribute<DetailReceipt, BigDecimal> cost;
    public static volatile SingularAttribute<DetailReceipt, Boolean> active;
    public static volatile SingularAttribute<DetailReceipt, Integer> id;
    public static volatile SingularAttribute<DetailReceipt, Service> serviceId;
    public static volatile SingularAttribute<DetailReceipt, Receipt> receiptId;

}