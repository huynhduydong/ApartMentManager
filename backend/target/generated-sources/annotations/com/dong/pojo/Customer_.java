package com.dong.pojo;

import com.dong.pojo.Accounts;
import com.dong.pojo.CustomerSurvey;
import com.dong.pojo.Feedback;
import com.dong.pojo.MerchandiseCabinet;
import com.dong.pojo.MerchandiseCabinetDetail;
import com.dong.pojo.Receipt;
import com.dong.pojo.RelativeParkCard;
import com.dong.pojo.Room;
import com.dong.pojo.UseService;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Date> birthday;
    public static volatile CollectionAttribute<Customer, MerchandiseCabinetDetail> merchandiseCabinetDetailCollection;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> gender;
    public static volatile CollectionAttribute<Customer, Feedback> feedbackCollection;
    public static volatile SingularAttribute<Customer, Boolean> active;
    public static volatile SingularAttribute<Customer, Room> roomId;
    public static volatile SingularAttribute<Customer, Accounts> accountId;
    public static volatile SingularAttribute<Customer, String> phoneNumber;
    public static volatile CollectionAttribute<Customer, RelativeParkCard> relativeParkCardCollection;
    public static volatile SingularAttribute<Customer, MerchandiseCabinet> merchandiseCabinetId;
    public static volatile CollectionAttribute<Customer, CustomerSurvey> customerSurveyCollection;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile CollectionAttribute<Customer, Receipt> receiptCollection;
    public static volatile CollectionAttribute<Customer, UseService> useServiceCollection;
    public static volatile SingularAttribute<Customer, String> email;

}