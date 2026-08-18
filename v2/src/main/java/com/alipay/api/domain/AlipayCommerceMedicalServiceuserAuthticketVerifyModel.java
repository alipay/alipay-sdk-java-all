package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回查三方互医授权票据
 *
 * @author auto create
 * @since 1.0, 2026-07-30 20:17:52
 */
public class AlipayCommerceMedicalServiceuserAuthticketVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2862371857494269715L;

	/**
	 * 授权票据
	 */
	@ApiField("auth_ticket")
	private String authTicket;

	public String getAuthTicket() {
		return this.authTicket;
	}
	public void setAuthTicket(String authTicket) {
		this.authTicket = authTicket;
	}

}
