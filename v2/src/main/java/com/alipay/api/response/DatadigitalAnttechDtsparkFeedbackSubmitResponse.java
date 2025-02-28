package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.dtspark.feedback.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 10:22:24
 */
public class DatadigitalAnttechDtsparkFeedbackSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6425836546392366881L;

	/** 
	 * 单次会话反馈结果
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
