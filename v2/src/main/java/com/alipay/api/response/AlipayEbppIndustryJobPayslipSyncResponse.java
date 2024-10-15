package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 15:12:10
 */
public class AlipayEbppIndustryJobPayslipSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2877474784152847921L;

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
