package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.nps.score.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 13:32:38
 */
public class AlipayCommerceMedicalNpsScoreSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3476994971621226541L;

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
