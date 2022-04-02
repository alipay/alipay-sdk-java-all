package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.payeeinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-10 11:45:30
 */
public class AlipayMarketingActivityPayeeinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1274159692586692979L;

	/** 
	 * 进件状态。

枚举值：
SUCCESS：进件成功

APPLY：已申请进件，处理中.
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
