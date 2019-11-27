package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.zhima.data.batch.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppZhimaDataBatchFeedbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 7829127368912975114L;

	/** 
	 * 业务调用是否成功
	 */
	@ApiField("biz_success")
	private String bizSuccess;

	public void setBizSuccess(String bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public String getBizSuccess( ) {
		return this.bizSuccess;
	}

}
