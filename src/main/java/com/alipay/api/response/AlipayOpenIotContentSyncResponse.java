package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iot.content.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 10:26:49
 */
public class AlipayOpenIotContentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5835461787679118244L;

	/** 
	 * 错误说明，错误情况会包含通用错误码中不包含的场景错误信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 同步结果码，根据不同场景可能有所不同
	 */
	@ApiField("sync_result_code")
	private String syncResultCode;

	/** 
	 * 内容同步埋点，内部应用与外部调用的串联埋点
	 */
	@ApiField("sync_token")
	private String syncToken;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setSyncResultCode(String syncResultCode) {
		this.syncResultCode = syncResultCode;
	}
	public String getSyncResultCode( ) {
		return this.syncResultCode;
	}

	public void setSyncToken(String syncToken) {
		this.syncToken = syncToken;
	}
	public String getSyncToken( ) {
		return this.syncToken;
	}

}
