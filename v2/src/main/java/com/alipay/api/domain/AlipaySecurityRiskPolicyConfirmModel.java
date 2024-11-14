package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全策略确认服务输出
 *
 * @author auto create
 * @since 1.0, 2023-02-24 17:11:51
 */
public class AlipaySecurityRiskPolicyConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3781366419728252679L;

	/**
	 * 二次确认参数，防止篡改
	 */
	@ApiField("confirm_params")
	private String confirmParams;

	/**
	 * 安全请求生成的唯一ID
	 */
	@ApiField("security_id")
	private String securityId;

	public String getConfirmParams() {
		return this.confirmParams;
	}
	public void setConfirmParams(String confirmParams) {
		this.confirmParams = confirmParams;
	}

	public String getSecurityId() {
		return this.securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

}
