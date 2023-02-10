package com.hardz.tg.telegrammbotchatgpt.controller;

import com.hardz.tg.telegrammbotchatgpt.model.User;
import com.hardz.tg.telegrammbotchatgpt.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("${app.http.bot")
@RequiredArgsConstructor
@SuppressWarnings("unused")
public class UsersController {

    private final UserService userService;

    /**
     * Возвращает список пользователей и связанных с ними планами
     */
    @GetMapping(path = "/users_idea")
    public List<User> getIdeaList() {
        log.debug("Method - getIdeaList was called");
        return userService.getUserList();
    }
}
