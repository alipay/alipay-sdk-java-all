package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.present.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:34:46
 */
public class AlipayCommerceLotteryPresentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7856813225535919245L;

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
