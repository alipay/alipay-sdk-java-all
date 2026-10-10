package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:17
 */
public class AlipayVoyagerMarketingFeedbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 4267621234454895489L;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
