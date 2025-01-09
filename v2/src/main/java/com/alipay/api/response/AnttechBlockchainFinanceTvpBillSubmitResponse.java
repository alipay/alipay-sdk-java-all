package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.bill.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 10:17:21
 */
public class AnttechBlockchainFinanceTvpBillSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6894719168461743146L;

	/** 
	 * 账单Id，数科唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
