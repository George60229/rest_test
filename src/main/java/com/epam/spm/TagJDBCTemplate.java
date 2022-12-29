package com.epam.spm;

import java.util.List;

public class TagJDBCTemplate extends AbstractJDBCTemplate implements EntityDAO<Tag>{
      public void create(String name, Integer price) {
        String SQL = "insert into certificates (name, price) values (?, ?)";

        jdbcTemplateObject.update( SQL, name, price);
        System.out.println("Created Record Name = " + name + " Price = " + price);

    }

    @Override
    public Tag getEntityById(Integer id) {
        return null;
    }

    @Override
    public List<Tag> listCertificates() {
      return null;

    }

    @Override
    public void deleteById(Integer id) {

    }
}
