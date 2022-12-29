package com.epam.spm;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TagMapper {
    public Tag mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tag tag = new Tag();
        tag.setName(rs.getString("name"));
        return tag;
    }
}
