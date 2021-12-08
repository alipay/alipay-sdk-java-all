package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控平台http代理接口
 *
 * @author auto create
 * @since 1.0, 2021-03-31 14:52:25
 */
public class AnttechBlockchainRiskHttpproxyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7115496355492642822L;

	/**
	 * char set
	 */
	@ApiField("char_set")
	private String charSet;

	/**
	 * content type
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * http body参数
	 */
	@ApiField("data")
	private String data;

	/**
	 * http请求头
	 */
	@ApiField("headers")
	private String headers;

	/**
	 * http 方法
	 */
	@ApiField("http_method")
	private String httpMethod;

	/**
	 * url参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 请求url地址
	 */
	@ApiField("url")
	private String url;

	public String getCharSet() {
		return this.charSet;
	}
	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getHeaders() {
		return this.headers;
	}
	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public String getHttpMethod() {
		return this.httpMethod;
	}
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
