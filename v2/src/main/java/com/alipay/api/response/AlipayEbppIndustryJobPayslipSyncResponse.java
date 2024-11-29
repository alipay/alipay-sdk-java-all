package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 10:52:20
 */
public class AlipayEbppIndustryJobPayslipSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5684617186675331388L;

	/** 
	 * 业务流水编号
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
