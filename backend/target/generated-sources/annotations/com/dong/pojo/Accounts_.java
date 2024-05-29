package com.dong.pojo;

import com.dong.pojo.Customer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Accounts.class)
public class Accounts_ { 

    public static volatile SingularAttribute<Accounts, String> password;
    public static volatile SingularAttribute<Accounts, String> role;
    public static volatile CollectionAttribute<Accounts, Customer> customerCollection;
    public static volatile SingularAttribute<Accounts, Boolean> active;
    public static volatile SingularAttribute<Accounts, Integer> id;
    public static volatile SingularAttribute<Accounts, String> avatar;
    public static volatile SingularAttribute<Accounts, String> username;

}