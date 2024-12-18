package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:33
 */
public class AlipayInsAutoUserMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7824517552463484413L;

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
