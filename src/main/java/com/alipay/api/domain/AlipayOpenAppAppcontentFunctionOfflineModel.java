package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务失效
 *
 * @author auto create
 * @since 1.0, 2020-07-15 13:06:50
 */
public class AlipayOpenAppAppcontentFunctionOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 7593469222924532691L;

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
