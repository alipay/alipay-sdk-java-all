package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用内容服务查询
 *
 * @author auto create
 * @since 1.0, 2020-07-15 13:06:22
 */
public class AlipayOpenAppAppcontentFunctionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4768982615147423244L;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
