package com.dong.pojo;

import com.dong.pojo.Customer;
import com.dong.pojo.Service;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(UseService.class)
public class UseService_ { 

    public static volatile SingularAttribute<UseService, Date> date;
    public static volatile SingularAttribute<UseService, Customer> customerId;
    public static volatile SingularAttribute<UseService, Boolean> active;
    public static volatile SingularAttribute<UseService, Integer> id;
    public static volatile SingularAttribute<UseService, Service> serviceId;

}