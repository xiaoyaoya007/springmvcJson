package com.etc.vo;

public class LoginResp {
    private Boolean result;
    private String msg;

    public LoginResp() {
    }

    public LoginResp(Boolean result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "LoginResp{" +
                "result=" + result +
                ", msg='" + msg + '\'' +
                '}';
    }
}
