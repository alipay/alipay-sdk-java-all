package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.settle response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-26 11:26:07
 */
public class AlipayMarketingActivityOrdervoucherSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 4248142733858678559L;

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
