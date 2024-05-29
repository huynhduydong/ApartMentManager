package com.dong.pojo;

import com.dong.pojo.MerchandiseCabinetDetail;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Merchandise.class)
public class Merchandise_ { 

    public static volatile SingularAttribute<Merchandise, Date> date;
    public static volatile SingularAttribute<Merchandise, String> note;
    public static volatile SingularAttribute<Merchandise, String> unit;
    public static volatile CollectionAttribute<Merchandise, MerchandiseCabinetDetail> merchandiseCabinetDetailCollection;
    public static volatile SingularAttribute<Merchandise, String> name;
    public static volatile SingularAttribute<Merchandise, Boolean> active;
    public static volatile SingularAttribute<Merchandise, Integer> id;

}