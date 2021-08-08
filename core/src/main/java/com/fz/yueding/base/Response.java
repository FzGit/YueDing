package com.fz.yueding.base;

/**
 * @Author Fanzy
 * @Description //TODO
 * @Date 2021/8/7 23:27
 */

public class Response<T> {

    private Response(String massage, Integer code, T data){
        this.massage = massage;
        this.code = code;
        this.data = data;
    }

    private String massage;
    private Integer code;
    private T data;

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMassage() {
        return massage;
    }

    public Integer getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public static <T> Response success(String massage, Integer code, T data) {
        return new Response(massage, code, data);
    }

    public static <T> Response success(Integer code, T data) {
        return success("SUCCESS", code, data);
    }

    public static <T> Response success(T data) {
        return success("SUCCESS", 200, data);
    }

    public static <T> Response fault(String massage, Integer code, T data) {
        return new Response(massage, code, data);
    }

    public static <T> Response fault(Integer code, T data) {
        return fault("Fault", code, data);
    }

}

