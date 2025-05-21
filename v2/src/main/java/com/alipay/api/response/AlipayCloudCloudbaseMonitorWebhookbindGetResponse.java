package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.webhookbind.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:22
 */
public class AlipayCloudCloudbaseMonitorWebhookbindGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7298711443351325843L;

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

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	public String getRequestBody( ) {
		return this.requestBody;
	}

	public void setRequestHeaders(String requestHeaders) {
		this.requestHeaders = requestHeaders;
	}
	public String getRequestHeaders( ) {
		return this.requestHeaders;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestType( ) {
		return this.requestType;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	public String getRequestUrl( ) {
		return this.requestUrl;
	}

}
