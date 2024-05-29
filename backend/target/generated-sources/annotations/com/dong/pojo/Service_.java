package com.dong.pojo;

import com.dong.pojo.DetailReceipt;
import com.dong.pojo.UseService;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Service.class)
public class Service_ { 

    public static volatile SingularAttribute<Service, Date> date;
    public static volatile SingularAttribute<Service, String> unit;
    public static volatile SingularAttribute<Service, BigDecimal> cost;
    public static volatile CollectionAttribute<Service, DetailReceipt> detailReceiptCollection;
    public static volatile SingularAttribute<Service, String> name;
    public static volatile SingularAttribute<Service, String> description;
    public static volatile SingularAttribute<Service, Boolean> active;
    public static volatile SingularAttribute<Service, Integer> id;
    public static volatile CollectionAttribute<Service, UseService> useServiceCollection;

}