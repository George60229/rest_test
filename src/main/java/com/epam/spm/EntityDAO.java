package com.epam.spm;

import javax.sql.DataSource;
import java.util.List;

public interface EntityDAO<E> {

    public void setDataSource(DataSource ds);

    public E getEntityById(Integer id);


    public List<E> listCertificates();

    public void deleteById(Integer id);
}
