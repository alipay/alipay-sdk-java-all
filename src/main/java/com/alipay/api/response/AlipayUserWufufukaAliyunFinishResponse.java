package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.wufufuka.aliyun.finish response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-10 15:56:02
 */
public class AlipayUserWufufukaAliyunFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7689337191167595268L;

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
