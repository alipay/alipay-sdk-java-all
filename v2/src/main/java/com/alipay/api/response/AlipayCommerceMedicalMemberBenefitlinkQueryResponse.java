package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.benefitlink.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 15:52:53
 */
public class AlipayCommerceMedicalMemberBenefitlinkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6624188299713431232L;

	/** 
	 * 权益跳转链接
	 */
	@ApiField("link")
	private String link;

	public void setLink(String link) {
		this.link = link;
	}
	public String getLink( ) {
		return this.link;
	}

}
