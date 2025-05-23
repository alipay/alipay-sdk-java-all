package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.share.admittance.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:17:47
 */
public class AlipayUserFamilyShareAdmittancePreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2445816668483181987L;

	/** 
	 * 是否准入
	 */
	@ApiField("admittance")
	private Boolean admittance;

	/** 
	 * 不可准入的原因
	 */
	@ApiField("unadmitted_reason")
	private String unadmittedReason;

	public void setAdmittance(Boolean admittance) {
		this.admittance = admittance;
	}
	public Boolean getAdmittance( ) {
		return this.admittance;
	}

	public void setUnadmittedReason(String unadmittedReason) {
		this.unadmittedReason = unadmittedReason;
	}
	public String getUnadmittedReason( ) {
		return this.unadmittedReason;
	}

}
