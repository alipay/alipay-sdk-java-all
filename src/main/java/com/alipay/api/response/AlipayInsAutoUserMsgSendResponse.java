package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-13 11:24:28
 */
public class AlipayInsAutoUserMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5323777963131468746L;

	/** 
	 * 描述是否可以重试
	 */
	@ApiField("can_retry")
	private Boolean canRetry;

	public void setCanRetry(Boolean canRetry) {
		this.canRetry = canRetry;
	}
	public Boolean getCanRetry( ) {
		return this.canRetry;
	}

}
