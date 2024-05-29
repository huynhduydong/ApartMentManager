package com.dong.pojo;

import com.dong.pojo.CustomerSurvey;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile SingularAttribute<Question, String> question;
    public static volatile CollectionAttribute<Question, CustomerSurvey> customerSurveyCollection;
    public static volatile SingularAttribute<Question, Integer> id;
    public static volatile SingularAttribute<Question, String> type;

}