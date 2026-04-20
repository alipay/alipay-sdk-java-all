package com.alipay.mcp.protocol;

import java.util.List;
import java.util.Map;

/**
 * JSON-RPC 2.0 消息
 *
 * @author alipay
 */
public class JsonRpcMessage {

    private String jsonrpc = "2.0";
    private String id;
    private String method;
    private Object params;
    private Object result;
    private JsonRpcError error;

    public static JsonRpcMessage createRequest(String method, Object params, String id) {
        JsonRpcMessage msg = new JsonRpcMessage();
        msg.id = id;
        msg.method = method;
        msg.params = params;
        return msg;
    }

    public static JsonRpcMessage createResponse(String id, Object result) {
        JsonRpcMessage msg = new JsonRpcMessage();
        msg.id = id;
        msg.result = result;
        return msg;
    }

    // getters and setters
    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public JsonRpcError getError() {
        return error;
    }

    public void setError(JsonRpcError error) {
        this.error = error;
    }
}