package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2021-12-28 20:06:43
 */
public class AuthExtendParams extends AlipayObject {

	private static final long serialVersionUID = 3898123152423724283L;

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
