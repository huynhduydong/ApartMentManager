package com.dong.pojo;

import com.dong.pojo.Answer;
import com.dong.pojo.Customer;
import com.dong.pojo.Question;
import com.dong.pojo.Survey;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-28T12:53:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(CustomerSurvey.class)
public class CustomerSurvey_ { 

    public static volatile SingularAttribute<CustomerSurvey, Answer> answerId;
    public static volatile SingularAttribute<CustomerSurvey, Survey> surveyId;
    public static volatile SingularAttribute<CustomerSurvey, Question> questionId;
    public static volatile SingularAttribute<CustomerSurvey, Customer> customerId;
    public static volatile SingularAttribute<CustomerSurvey, Integer> id;

}