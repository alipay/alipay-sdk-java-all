package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.bankverify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-16 21:02:56
 */
public class AlipayTradeSaasBankverifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8595861681523448912L;

	/** 
	 * 平台认证流水号
	 */
	@ApiField("bank_verify_order_no")
	private String bankVerifyOrderNo;

	/** 
	 * 创建打款认证链接时使用的客户幂等号，长度 1-64，仅允许 `[A-Za-z0-9_-]+`
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 平台认证状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 平台认证状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/** 
	 * 认证时间
	 */
	@ApiField("verify_end_time")
	private String verifyEndTime;

	public void setBankVerifyOrderNo(String bankVerifyOrderNo) {
		this.bankVerifyOrderNo = bankVerifyOrderNo;
	}
	public String getBankVerifyOrderNo( ) {
		return this.bankVerifyOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDesc( ) {
		return this.statusDesc;
	}

	public void setVerifyEndTime(String verifyEndTime) {
		this.verifyEndTime = verifyEndTime;
	}
	public String getVerifyEndTime( ) {
		return this.verifyEndTime;
	}

}
