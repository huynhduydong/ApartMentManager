package com.dong.pojo;

import com.dong.pojo.Customer;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(RelativeParkCard.class)
public class RelativeParkCard_ { 

    public static volatile SingularAttribute<RelativeParkCard, BigDecimal> cost;
    public static volatile SingularAttribute<RelativeParkCard, Customer> customerId;
    public static volatile SingularAttribute<RelativeParkCard, String> description;
    public static volatile SingularAttribute<RelativeParkCard, Boolean> active;
    public static volatile SingularAttribute<RelativeParkCard, Integer> id;
    public static volatile SingularAttribute<RelativeParkCard, Date> expiry;
    public static volatile SingularAttribute<RelativeParkCard, Date> dateCreate;

}