package com.boot.springbootweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author wanyu
 * @createTime 2022-03-22 22:37
 */
@ResponseStatus(value= HttpStatus.FORBIDDEN,reason = "用户数量太多")
public class UserTooManyException extends RuntimeException {
    public  UserTooManyException(){

    }
    public  UserTooManyException(String message){
        super(message);
    }
}
