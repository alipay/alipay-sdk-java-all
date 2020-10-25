package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户开通isv服务接口
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:45:21
 */
public class AlipayIserviceCcmServiceBuyModel extends AlipayObject {

	private static final long serialVersionUID = 2685448977536311587L;

	/**
	 * 服务代码
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
