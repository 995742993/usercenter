package com.xwz.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -2422199217666687722L;
    private Integer code;
    private T data;
    private String message;
    private String description;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(Integer code, T data, String message) {
        this(code,data,message,"");
    }

    public BaseResponse(Integer code,String message, String description) {
        this(code,null,message,description);
    }

    public BaseResponse(Integer code, T data) {
        this(code,data,"","");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(),null,errorCode.getMessage(),errorCode.getDescription());
    }
}
