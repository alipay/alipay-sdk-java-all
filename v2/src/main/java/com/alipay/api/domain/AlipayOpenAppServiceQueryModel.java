package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务查询
 *
 * @author auto create
 * @since 1.0, 2023-11-14 19:33:54
 */
public class AlipayOpenAppServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8278573254479788994L;

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
