package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.depositorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:17:05
 */
public class AlipayCloudFundWalletDepositorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3766856715978136682L;

	/** 
	 * 资金单据
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setFundOrderId(String fundOrderId) {
		this.fundOrderId = fundOrderId;
	}
	public String getFundOrderId( ) {
		return this.fundOrderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
