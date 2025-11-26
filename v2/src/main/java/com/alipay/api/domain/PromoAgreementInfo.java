package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动协议信息
 *
 * @author auto create
 * @since 1.0, 2025-09-08 10:22:26
 */
public class PromoAgreementInfo extends AlipayObject {

	private static final long serialVersionUID = 8848947358955715522L;

	/**
	 * 活动的协议名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 活动的协议链接
	 */
	@ApiField("url")
	private String url;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
