package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收单主体明细
 *
 * @author auto create
 * @since 1.0, 2021-01-25 21:13:24
 */
public class AuthorizeDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4466997326649648468L;

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
