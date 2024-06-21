package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.aeprepay.contract.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-16 19:16:41
 */
public class ZhimaCreditEpAeprepayContractCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516299776961968258L;

	/** 
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 解约失败原因码。成功时为空
	 */
	@ApiField("failed_code")
	private String failedCode;

	/** 
	 * 解约失败原因描述。成功时为空
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
