package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdoperation.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 14:52:03
 */
public class AlipayMarketingQipanCrowdoperationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5873937733817228618L;

	/** 
	 * 棋盘人群的唯一编码
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}
	public String getCrowdCode( ) {
		return this.crowdCode;
	}

}
