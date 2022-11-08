package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.depositorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 20:58:05
 */
public class AlipayFundWalletDepositorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8114342233166673923L;

	/** 
	 * 内部单据
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 资金单据
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

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
