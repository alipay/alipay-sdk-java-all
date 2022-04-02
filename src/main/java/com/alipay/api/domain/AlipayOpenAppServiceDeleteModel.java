package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务失效接口
 *
 * @author auto create
 * @since 1.0, 2021-08-23 15:00:02
 */
public class AlipayOpenAppServiceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8357222314384151191L;

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
