package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-24 19:46:46
 */
public class AlipayCommerceTransportEtcApplyorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2731742445652584883L;

	/** 
	 * SUCCESS：成功； {FAIL}:{失败原因}
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
ORDER_NOT_EXIST：订单不存在
ORDER_STATUS_ILLEGAL：订单状态非法
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 同步结果，true/false
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
