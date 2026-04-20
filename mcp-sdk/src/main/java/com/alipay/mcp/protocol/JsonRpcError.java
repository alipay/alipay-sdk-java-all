package com.alipay.mcp.protocol;

/**
 * JSON-RPC 错误
 *
 * @author alipay
 */
public class JsonRpcError {

    /** 解析错误 */
    public static final int PARSE_ERROR = -32700;
    /** 无效请求 */
    public static final int INVALID_REQUEST = -32600;
    /** 方法未找到 */
    public static final int METHOD_NOT_FOUND = -32601;
    /** 无效参数 */
    public static final int INVALID_PARAMS = -32602;
    /** 内部错误 */
    public static final int INTERNAL_ERROR = -32603;

    private int code;
    private String message;
    private Object data;

    public JsonRpcError() {}

    public JsonRpcError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonRpcError(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}