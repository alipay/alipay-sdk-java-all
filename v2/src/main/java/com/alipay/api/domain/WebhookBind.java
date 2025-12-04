package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * webhook 绑定信息
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:46:14
 */
public class WebhookBind extends AlipayObject {

	private static final long serialVersionUID = 2532795819186928698L;

	/**
	 * 绑定ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 绑定名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否启用
	 */
	@ApiField("open")
	private Boolean open;

	/**
	 * 请求对象
	 */
	@ApiField("request_body")
	private String requestBody;

	/**
	 * 请求头
	 */
	@ApiField("request_headers")
	private String requestHeaders;

	/**
	 * 请求类型
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 请求地址
	 */
	@ApiField("request_url")
	private String requestUrl;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOpen() {
		return this.open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}

	public String getRequestBody() {
		return this.requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getRequestHeaders() {
		return this.requestHeaders;
	}
	public void setRequestHeaders(String requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestUrl() {
		return this.requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

}
