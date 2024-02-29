package com.test.api.demo.game.deposit.service;

import com.test.api.demo.game.deposit.dto.Request;
import com.test.api.demo.game.exception.Error500;
import org.springframework.stereotype.Service;

@Service
public class SettleService {

    public String settle(Request request) throws Error500 {
        if (request.getId().equals("error")) {
            throw new Error500("This is wrong");
        }

        return request.getId() + " is settled.";
    }
}
