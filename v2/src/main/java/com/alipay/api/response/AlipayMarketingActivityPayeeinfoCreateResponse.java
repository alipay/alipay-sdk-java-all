package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.payeeinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:17:44
 */
public class AlipayMarketingActivityPayeeinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4181549618198888316L;

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
