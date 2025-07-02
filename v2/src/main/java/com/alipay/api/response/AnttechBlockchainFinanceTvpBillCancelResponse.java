package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.bill.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-07 17:17:25
 */
public class AnttechBlockchainFinanceTvpBillCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4858461227947115742L;

	/** 
	 * 账单状态。
撤销成功返回 CLOSED。
已申请撤销但结果未确认，返回CLOSING。
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
