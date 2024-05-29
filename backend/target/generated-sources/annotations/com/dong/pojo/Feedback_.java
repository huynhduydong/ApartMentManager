package com.dong.pojo;

import com.dong.pojo.Customer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Feedback.class)
public class Feedback_ { 

    public static volatile SingularAttribute<Feedback, Customer> customerId;
    public static volatile SingularAttribute<Feedback, Integer> id;
    public static volatile SingularAttribute<Feedback, String> title;
    public static volatile SingularAttribute<Feedback, String> content;

}