package com.epam.spm;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource=context.getBean("dataSource", DataSource.class);
            CertificatesJDBCTemplate studentJDBCTemplate=new CertificatesJDBCTemplate();
            studentJDBCTemplate.setDataSource(dataSource);
context.close();
        System.out.println("------Records Creation--------" );


        studentJDBCTemplate.deleteById(113);

        System.out.println("------Listing Multiple Records--------" );
        List<Gift_certificate> students = studentJDBCTemplate.listCertificates();

        for (Gift_certificate record : students) {
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getPrice());
        }
    }
}
