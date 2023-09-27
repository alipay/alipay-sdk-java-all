package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务失效接口
 *
 * @author auto create
 * @since 1.0, 2023-09-27 14:26:52
 */
public class AlipayOpenAppServiceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6153162137998813265L;

	/**
	 * 服务id
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
