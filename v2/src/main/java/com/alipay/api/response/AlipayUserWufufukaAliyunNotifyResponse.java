package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.wufufuka.aliyun.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:45:08
 */
public class AlipayUserWufufukaAliyunNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2868269581523467787L;

	/** 
	 * 是否重试flag，下游理解并判断是否重试
	 */
	@ApiField("retry_flag")
	private Boolean retryFlag;

	public void setRetryFlag(Boolean retryFlag) {
		this.retryFlag = retryFlag;
	}
	public Boolean getRetryFlag( ) {
		return this.retryFlag;
	}

}
