package com.epam.spm;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GiftMapper implements RowMapper<Gift_certificate> {
    public Gift_certificate mapRow(ResultSet rs, int rowNum) throws SQLException {
        Gift_certificate certificate = new Gift_certificate();
        certificate.setPrice(rs.getInt("price"));
        certificate.setName(rs.getString("name"));
        certificate.setCreate_date(rs.getDate("create_date"));
        certificate.setDescription(rs.getString("description"));
        certificate.setDuration(rs.getInt("duration"));
        certificate.setLast_update_date(rs.getDate("last_update_date"));

        return certificate;
    }

}
