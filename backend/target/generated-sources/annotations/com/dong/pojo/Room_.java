package com.dong.pojo;

import com.dong.pojo.Customer;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Date> date;
    public static volatile SingularAttribute<Room, String> code;
    public static volatile CollectionAttribute<Room, Customer> customerCollection;
    public static volatile SingularAttribute<Room, Boolean> active;
    public static volatile SingularAttribute<Room, Integer> id;

}