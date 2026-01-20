package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.nps.score.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-26 17:32:42
 */
public class AlipayCommerceMedicalNpsScoreSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5443417995129771382L;

	/** 
	 * 处理结果
	 */
	@ApiField("deal_info")
	private Boolean dealInfo;

	public void setDealInfo(Boolean dealInfo) {
		this.dealInfo = dealInfo;
	}
	public Boolean getDealInfo( ) {
		return this.dealInfo;
	}

}
