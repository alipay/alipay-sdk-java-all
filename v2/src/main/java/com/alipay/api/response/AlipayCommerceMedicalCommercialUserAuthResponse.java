package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.user.auth response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 11:07:33
 */
public class AlipayCommerceMedicalCommercialUserAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 4186911632916872515L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 店员在支付宝端内的用户ID
	 */
	@ApiField("staff_user_id")
	private String staffUserId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setStaffUserId(String staffUserId) {
		this.staffUserId = staffUserId;
	}
	public String getStaffUserId( ) {
		return this.staffUserId;
	}

}
