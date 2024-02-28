package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定向规则
 *
 * @author auto create
 * @since 1.0, 2023-11-20 15:20:00
 */
public class DeliveryOrientedRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1185389935136526651L;

	/**
	 * 客户端
	 */
	@ApiField("client_platform")
	private String clientPlatform;

	public String getClientPlatform() {
		return this.clientPlatform;
	}
	public void setClientPlatform(String clientPlatform) {
		this.clientPlatform = clientPlatform;
	}

}
