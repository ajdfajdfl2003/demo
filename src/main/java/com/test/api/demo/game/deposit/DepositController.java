package com.test.api.demo.game.deposit;

import com.test.api.demo.game.deposit.dto.Request;
import com.test.api.demo.game.deposit.service.SettleService;
import com.test.api.demo.game.exception.Error500;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "game")
@RequiredArgsConstructor
public class DepositController {
    private final SettleService settleService;

    @PostMapping(value = "deposit")
    public String settle(@Valid @RequestBody Request request) throws Error500 {
        try {
            return settleService.settle(request);
        } catch (Exception e) {
            throw new Error500(e);
        }
    }
}
