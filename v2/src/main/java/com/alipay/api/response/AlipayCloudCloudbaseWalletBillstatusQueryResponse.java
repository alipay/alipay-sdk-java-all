package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.billstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 15:47:51
 */
public class AlipayCloudCloudbaseWalletBillstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1113711722623215785L;

	/** 
	 * 账单金额(分)
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 原始账单金额(分)
	 */
	@ApiField("origin_bill_amount")
	private String originBillAmount;

	/** 
	 * 出账状态
	 */
	@ApiField("result")
	private Boolean result;

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillAmount( ) {
		return this.billAmount;
	}

	public void setOriginBillAmount(String originBillAmount) {
		this.originBillAmount = originBillAmount;
	}
	public String getOriginBillAmount( ) {
		return this.originBillAmount;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
