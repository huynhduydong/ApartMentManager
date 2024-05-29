package com.dong.pojo;

import com.dong.pojo.Customer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(MerchandiseCabinet.class)
public class MerchandiseCabinet_ { 

    public static volatile CollectionAttribute<MerchandiseCabinet, Customer> customerCollection;
    public static volatile SingularAttribute<MerchandiseCabinet, String> name;
    public static volatile SingularAttribute<MerchandiseCabinet, String> description;
    public static volatile SingularAttribute<MerchandiseCabinet, Boolean> active;
    public static volatile SingularAttribute<MerchandiseCabinet, Integer> id;

}