package com.dong.pojo;

import com.dong.pojo.Customer;
import com.dong.pojo.Merchandise;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(MerchandiseCabinetDetail.class)
public class MerchandiseCabinetDetail_ { 

    public static volatile SingularAttribute<MerchandiseCabinetDetail, Merchandise> merchandiseId;
    public static volatile SingularAttribute<MerchandiseCabinetDetail, Float> quantity;
    public static volatile SingularAttribute<MerchandiseCabinetDetail, Date> dateReceive;
    public static volatile SingularAttribute<MerchandiseCabinetDetail, Customer> customerId;
    public static volatile SingularAttribute<MerchandiseCabinetDetail, Boolean> isReceive;
    public static volatile SingularAttribute<MerchandiseCabinetDetail, Integer> id;

}