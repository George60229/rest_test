package com.epam.spm;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GiftMapper implements RowMapper<Gift_certificate> {
    public Gift_certificate mapRow(ResultSet rs, int rowNum) throws SQLException {
        Gift_certificate certificate = new Gift_certificate();
        certificate.setPrice(rs.getInt("price"));
        certificate.setName(rs.getString("name"));
        return certificate;
    }

}
