package com.leyou.common.exception.pojo;

import lombok.Getter;

/**
 * 封装异常信息类
 */
@Getter
public class ExceptionResult {

    private Integer status;
    private String message;

    public ExceptionResult(Integer status,String  message){
        this.status = status;
        this.message = message;
    }

    public ExceptionResult(LyException e){
        this.status = e.getStatus();
        this.message = e.getMessage();
    }
}

