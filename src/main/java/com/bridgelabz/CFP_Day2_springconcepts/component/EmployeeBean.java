package com.bridgelabz.CFP_Day2_springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
    @Autowired
    public DepartmentBean deptBean;
    private int eid;
    private String ename;

    public EmployeeBean() {
    } // Constructor

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("***Autowiring by using Autowire annotation on setter***");
        this.deptBean = deptBean;
    }

    public void showEployeeDetails() {
        logger.debug("Employee id:{}", eid);
        logger.debug("Employee Name: {}", ename);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department:{}", deptBean.getDeptName());
    }


}
