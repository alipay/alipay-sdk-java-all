package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.wufufuka.aliyun.finish response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:09:08
 */
public class AlipayUserWufufukaAliyunFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3576733185578553855L;

	/** 
	 * 是否需要重试，接口失败情况下，根据该字段判断是否需要重试
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
