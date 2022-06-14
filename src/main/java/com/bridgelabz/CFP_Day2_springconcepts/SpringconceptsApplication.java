package com.bridgelabz.CFP_Day2_springconcepts;

import com.bridgelabz.CFP_Day2_springconcepts.component.DemoBean;
import com.bridgelabz.CFP_Day2_springconcepts.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconceptsApplication {
    public static final Logger logger = LoggerFactory.getLogger(SpringconceptsApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to Spring Concept Demo");
        ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
        logger.debug("Checking context:{}", context.getBean(DemoBean.class));
        logger.debug("\n **** Example Using @autowire annotation on property ***");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework guru");
        employeeBean.showEployeeDetails();
    }

}
