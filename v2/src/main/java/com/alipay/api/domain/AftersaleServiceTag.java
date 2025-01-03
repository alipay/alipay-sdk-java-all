package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后服务标签
 *
 * @author auto create
 * @since 1.0, 2024-12-16 15:55:21
 */
public class AftersaleServiceTag extends AlipayObject {

	private static final long serialVersionUID = 4323332341581469279L;

	/**
	 * 服务标签的编码
	 */
	@ApiField("service_tag_code")
	private String serviceTagCode;

	/**
	 * 服务标签名称。
	 */
	@ApiField("service_tag_name")
	private String serviceTagName;

	public String getServiceTagCode() {
		return this.serviceTagCode;
	}
	public void setServiceTagCode(String serviceTagCode) {
		this.serviceTagCode = serviceTagCode;
	}

	public String getServiceTagName() {
		return this.serviceTagName;
	}
	public void setServiceTagName(String serviceTagName) {
		this.serviceTagName = serviceTagName;
	}

}
