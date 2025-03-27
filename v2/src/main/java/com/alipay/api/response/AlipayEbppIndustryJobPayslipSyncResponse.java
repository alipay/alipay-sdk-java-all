package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-18 20:57:25
 */
public class AlipayEbppIndustryJobPayslipSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265397437819573989L;

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
