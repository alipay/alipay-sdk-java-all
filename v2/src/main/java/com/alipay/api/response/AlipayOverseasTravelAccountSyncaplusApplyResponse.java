package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.account.syncaplus.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:28
 */
public class AlipayOverseasTravelAccountSyncaplusApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5712684268474135976L;

	/** 
	 * 是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果详情
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}
	public Boolean getNeedRetry( ) {
		return this.needRetry;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
