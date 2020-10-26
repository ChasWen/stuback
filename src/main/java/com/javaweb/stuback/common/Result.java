package com.javaweb.stuback.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private int code;
    private String msg;
    private Object date;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static  Result succ(int code, String msg, Object date){
        Result r =new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setDate(date);
        return r;
    }
}
