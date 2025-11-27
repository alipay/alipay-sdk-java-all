package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收单主体明细
 *
 * @author auto create
 * @since 1.0, 2023-03-07 19:54:35
 */
public class AuthorizeDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 8537612895238977726L;

	/**
	 * 收单主体PID
	 */
	@ApiField("authorized_principal_id")
	private String authorizedPrincipalId;

	public String getAuthorizedPrincipalId() {
		return this.authorizedPrincipalId;
	}
	public void setAuthorizedPrincipalId(String authorizedPrincipalId) {
		this.authorizedPrincipalId = authorizedPrincipalId;
	}

}
