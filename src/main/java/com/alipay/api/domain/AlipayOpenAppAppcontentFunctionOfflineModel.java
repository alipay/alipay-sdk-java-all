package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务失效
 *
 * @author auto create
 * @since 1.0, 2020-12-15 20:02:52
 */
public class AlipayOpenAppAppcontentFunctionOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 5177849563198354558L;

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
