package com.hardz.tg.telegrammbotchatgpt.repository;

import com.hardz.tg.telegrammbotchatgpt.exceptions.DbException;
import com.hardz.tg.telegrammbotchatgpt.model.User;

import java.util.List;

public interface IUserRepository {

    /**
     * Возвращает список записей по id
     *
     * @return запрашиваемая запись
     * @throws DbException в случае ошибки БД
     */
    User getById(int id);

    /**
     * Возвращает список записей
     *
     * @return список всех записей
     * @throws DbException в случае ошибки БД
     */
    List<User> getUserList();

    /**
     * Вставка новой записи
     *
     * @param entity new record
     * @throws DbException в случае ошибки БД
     */
    void insert(User entity);

    /**
     * Delete Record
     *
     * @param entity deletable record
     * @throws DbException в случае ошибки БД
     */
    void delete(User entity);
}
