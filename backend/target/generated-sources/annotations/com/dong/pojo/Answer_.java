package com.dong.pojo;

import com.dong.pojo.CustomerSurvey;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Answer.class)
public class Answer_ { 

    public static volatile SingularAttribute<Answer, Short> answer;
    public static volatile CollectionAttribute<Answer, CustomerSurvey> customerSurveyCollection;
    public static volatile SingularAttribute<Answer, Integer> id;

}