package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务载体
 *
 * @author auto create
 * @since 1.0, 2020-07-13 22:08:49
 */
public class ServiceUrl extends AlipayObject {

	private static final long serialVersionUID = 5874716827791353651L;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * URL
	 */
	@ApiField("url")
	private String url;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
