package com.test.api.demo.game.deposit;

import com.test.api.demo.game.exception.Error500;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Order(1)
@ControllerAdvice(basePackages = {"com.test.api.demo.game.deposit"})
@RequiredArgsConstructor
public class DepositExceptionHandler {

    @ExceptionHandler(Error500.class)
    public String internalError(Error500 e) {
        return "This is error 500.";
    }
}
