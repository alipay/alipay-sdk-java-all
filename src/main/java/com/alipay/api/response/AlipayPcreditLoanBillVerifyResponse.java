package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.bill.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanBillVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2843357397128264866L;

	/** 
	 * 还款销账单据号，由借呗系统生成，代还款成功或失败后有消息通知到机构
	 */
	@ApiField("repay_no")
	private String repayNo;

	public void setRepayNo(String repayNo) {
		this.repayNo = repayNo;
	}
	public String getRepayNo( ) {
		return this.repayNo;
	}

}
