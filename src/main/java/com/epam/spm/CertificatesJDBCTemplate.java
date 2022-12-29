package com.epam.spm;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CertificatesJDBCTemplate extends AbstractJDBCTemplate implements EntityDAO<Gift_certificate>{


    public void create(String name, Integer price) {
        String SQL = "insert into certificates (name, price) values (?, ?)";

        jdbcTemplateObject.update( SQL, name, price);
        System.out.println("Created Record Name = " + name + " Price = " + price);

    }

    @Override
    public Gift_certificate getEntityById(Integer id) {
        String SQL = "select name,price from certificates where certificate_id="+id;
        Gift_certificate certificate=new Gift_certificate();
        //todo
        return certificate;
    }

    @Override
    public List<Gift_certificate> listCertificates() {
        String SQL = "select name,price from certificates";
        List<Gift_certificate> certificates = jdbcTemplateObject.query(SQL, new GiftMapper());
        return certificates;

    }

    @Override
    public void deleteById(Integer id) {
        String SQL = "delete from certificates where certificate_id="+id;
        jdbcTemplateObject.update(SQL);
    }
    public void update(Integer id){

    }


}
