package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.settle response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-15 14:56:17
 */
public class AlipayMarketingActivityOrdervoucherSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 4797975913531546127L;

	/** 
	 * 用于查询结算单号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
