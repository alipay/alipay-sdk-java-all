package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.present.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:17:41
 */
public class AlipayCommerceLotteryPresentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3838393347668997723L;

	/** 
	 * 是否赠送成功
	 */
	@ApiField("send_result")
	private Boolean sendResult;

	public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}
	public Boolean getSendResult( ) {
		return this.sendResult;
	}

}
