package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.asset.repayment.prove response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:37:41
 */
public class AnttechBlockchainFinanceAssetRepaymentProveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7848394265435694213L;

	/** 
	 * 是否受理
	 */
	@ApiField("accepted")
	private Boolean accepted;

	/** 
	 * 错误编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
	public Boolean getAccepted( ) {
		return this.accepted;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

}
