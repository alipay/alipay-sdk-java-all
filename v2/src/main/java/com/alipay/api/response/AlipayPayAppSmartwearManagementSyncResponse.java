package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.smartwear.management.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:08
 */
public class AlipayPayAppSmartwearManagementSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5452841557245727327L;

	/** 
	 * 扩展信息
	 */
	@ApiField("payload")
	private String payload;

	/** 
	 * 操作的结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 报错说明
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setPayload(String payload) {
		this.payload = payload;
	}
	public String getPayload( ) {
		return this.payload;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
