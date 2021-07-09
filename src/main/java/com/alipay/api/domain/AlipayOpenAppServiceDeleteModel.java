package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务失效接口
 *
 * @author auto create
 * @since 1.0, 2021-04-20 11:35:27
 */
public class AlipayOpenAppServiceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6691817433161663698L;

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
