package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.pre.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-14 16:18:13
 */
public class ZhimaCreditPeZmgoPreConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2335574193743486571L;

	/** 
	 * 是否准入
	 */
	@ApiField("admittance")
	private Boolean admittance;

	/** 
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public void setAdmittance(Boolean admittance) {
		this.admittance = admittance;
	}
	public Boolean getAdmittance( ) {
		return this.admittance;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

}
