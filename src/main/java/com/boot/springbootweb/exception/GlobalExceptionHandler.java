package com.boot.springbootweb.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author wanyu
 * @createTime 2022-03-22 22:35
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})  //处理异常
    public String handleArithException(Exception e) {
        log.error("异常是：{}", e);
        return "login"; //视图地址
    }
}
