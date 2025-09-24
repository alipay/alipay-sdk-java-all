package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.ticketstub.purchase.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 10:47:40
 */
public class AlipayOfflineMarketingTicketstubPurchaseSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1863168661137657554L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
