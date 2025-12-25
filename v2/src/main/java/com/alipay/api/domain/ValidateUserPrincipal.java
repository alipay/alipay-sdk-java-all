package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验用户主体信息
 *
 * @author auto create
 * @since 1.0, 2025-04-25 12:48:06
 */
public class ValidateUserPrincipal extends AlipayObject {

	private static final long serialVersionUID = 8639359995249474927L;

	/**
	 * 证件号
	 */
	@ApiField("principal_cert_no")
	private String principalCertNo;

	/**
	 * 校验的主体名称，如：个人名称、企业名称
	 */
	@ApiField("principal_name")
	private String principalName;

	public String getPrincipalCertNo() {
		return this.principalCertNo;
	}
	public void setPrincipalCertNo(String principalCertNo) {
		this.principalCertNo = principalCertNo;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

}
