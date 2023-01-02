import com.epam.spm.CertificatesJDBCTemplate;
import com.epam.spm.Gift_certificate;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;

public class First {
    DataSource dataSource;
    ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dataSource = context.getBean("dataSource", DataSource.class);
    }

    @Test
    public void testCertificatesToDB() {
        CertificatesJDBCTemplate certificatesJDBCTemplate = new CertificatesJDBCTemplate();
        certificatesJDBCTemplate.setDataSource(dataSource);
        context.close();

        certificatesJDBCTemplate.create("test_from_hear", 200);
        Gift_certificate certificate = certificatesJDBCTemplate.getEntityByName("test_from_hear");

        assertEquals("test_from_hear", certificate.getName());
        assertEquals(200, certificate.getPrice());
        certificatesJDBCTemplate.deleteById(certificate.getId());
    }
}
