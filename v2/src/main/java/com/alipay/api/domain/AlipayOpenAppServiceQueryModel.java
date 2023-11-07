package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务查询
 *
 * @author auto create
 * @since 1.0, 2023-11-06 12:50:46
 */
public class AlipayOpenAppServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6284965556597763958L;

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
