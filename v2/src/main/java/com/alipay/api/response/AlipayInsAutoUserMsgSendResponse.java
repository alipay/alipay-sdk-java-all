package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:46:46
 */
public class AlipayInsAutoUserMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5186689628419379125L;

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
