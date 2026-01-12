package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupmember.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 15:06:31
 */
public class AlipayMerchantGroupGroupmemberQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 3861254533387881144L;

	/** 
	 * 是否入群的标识
	 */
	@ApiField("joined")
	private Boolean joined;

	public void setJoined(Boolean joined) {
		this.joined = joined;
	}
	public Boolean getJoined( ) {
		return this.joined;
	}

}
