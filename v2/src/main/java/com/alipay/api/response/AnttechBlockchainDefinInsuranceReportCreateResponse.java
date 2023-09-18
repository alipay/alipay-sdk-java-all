package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.insurance.report.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:49
 */
public class AnttechBlockchainDefinInsuranceReportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4887623564618786512L;

	/** 
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/** 
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/** 
	 * 请求交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setParm(String parm) {
		this.parm = parm;
	}
	public String getParm( ) {
		return this.parm;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getReportNo( ) {
		return this.reportNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
