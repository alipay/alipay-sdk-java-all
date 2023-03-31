package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-03-28 15:19:14
 */
public class AuthExtendParams extends AlipayObject {

	private static final long serialVersionUID = 4295426941588111256L;

	/**
	 * 返佣参数
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
