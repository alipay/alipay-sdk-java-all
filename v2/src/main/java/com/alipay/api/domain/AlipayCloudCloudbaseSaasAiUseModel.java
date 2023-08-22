package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI SaaS 基础服务
 *
 * @author auto create
 * @since 1.0, 2023-08-22 14:53:58
 */
public class AlipayCloudCloudbaseSaasAiUseModel extends AlipayObject {

	private static final long serialVersionUID = 6789369826197749386L;

	/**
	 * 模型服务编码，具体值咨询模型服务提供者
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 模型服务uri，具体值咨询模型服务提供者
	 */
	@ApiField("uri")
	private String uri;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
