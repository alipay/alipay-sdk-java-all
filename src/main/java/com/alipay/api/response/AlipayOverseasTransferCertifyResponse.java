package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.certify response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-15 16:32:37
 */
public class AlipayOverseasTransferCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7391542552957722931L;

	/** 
	 * 是否有默认卡
	 */
	@ApiField("has_default_card")
	private String hasDefaultCard;

	/** 
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setHasDefaultCard(String hasDefaultCard) {
		this.hasDefaultCard = hasDefaultCard;
	}
	public String getHasDefaultCard( ) {
		return this.hasDefaultCard;
	}

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
