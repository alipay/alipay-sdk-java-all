package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.aeprepay.contract.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:38
 */
public class ZhimaCreditEpAeprepayContractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7288944121877237269L;

	/** 
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 签约失败原因码。成功时为空
	 */
	@ApiField("failed_code")
	private String failedCode;

	/** 
	 * 签约失败原因描述。成功时为空
	 */
	@ApiField("failed_message")
	private String failedMessage;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

	public void setFailedCode(String failedCode) {
		this.failedCode = failedCode;
	}
	public String getFailedCode( ) {
		return this.failedCode;
	}

	public void setFailedMessage(String failedMessage) {
		this.failedMessage = failedMessage;
	}
	public String getFailedMessage( ) {
		return this.failedMessage;
	}

}
