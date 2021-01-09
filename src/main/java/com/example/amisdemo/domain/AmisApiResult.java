package com.example.amisdemo.domain;

import lombok.Data;

/**
 * 格式参考 amis api 文档：https://baidu.gitee.io/amis/zh-CN/docs/types/api
 */
@Data
public class AmisApiResult {
    private int status; // status: 返回 0，表示当前接口正确返回，否则按错误请求处理；
    private String msg; // 返回接口处理信息，主要用于表单提交或请求失败时的 toast 显示；
    private Object data; // 必须返回一个具有 key-value 结构的对象。

    public AmisApiResult(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


    public static <T> AmisApiResult success(T data) {
        return new AmisApiResult(0, "", data);
    }

    public static AmisApiResult failure(String message) {
        return new AmisApiResult(1, message, null);
    }
}
