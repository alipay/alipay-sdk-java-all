package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.result.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:56:38
 */
public class AnttechAiCvRsResultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2132672127594146311L;

	/** 
	 * 各种类型的预测结果值
	 */
	@ApiField("predict_res")
	private String predictRes;

	public void setPredictRes(String predictRes) {
		this.predictRes = predictRes;
	}
	public String getPredictRes( ) {
		return this.predictRes;
	}

}
