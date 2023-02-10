package com.hardz.tg.telegrammbotchatgpt.repository;

import com.hardz.tg.telegrammbotchatgpt.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        var entity = new User(
                rs.getInt("id"),
                rs.getString("user_name"),
                rs.getString("description")
        );
        log.info("mapRow(): entity = [{}]", entity);
        return entity;
    }
}
