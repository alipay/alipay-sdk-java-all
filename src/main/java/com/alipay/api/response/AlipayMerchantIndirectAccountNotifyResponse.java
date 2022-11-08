package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.account.notify response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-21 13:22:04
 */
public class AlipayMerchantIndirectAccountNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7322742299672432721L;

	/** 
	 * 交易响应码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 响应码信息
	 */
	@ApiField("result_info")
	private String resultInfo;

	/** 
	 * 交易响应状态
FA:失败SU:成功
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
