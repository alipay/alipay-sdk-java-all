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

	private static final long serialVersionUID = 3248333558198379636L;

	/**
	 * 服务代码。通过<a href="https://opendocs.alipay.com/apis/01dmgh">alipay.iservice.ccm.service.initialize</a>(isv服务初始化接口) 获取。
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
