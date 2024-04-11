package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建 webhook 绑定
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:45:07
 */
public class AlipayCloudCloudbaseMonitorWebhookbindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2255986381688598671L;

	/**
	 * 绑定名称
	 */
	@ApiField("name")
	private String name;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
