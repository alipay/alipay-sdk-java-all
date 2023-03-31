package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InfoSecAnalyzeSyncResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.content.analyze.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:01:41
 */
public class AlipaySecurityRiskContentAnalyzeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4421455981211645138L;

	/** 
	 * 唯一请求ID
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/** 
	 * 检测结果
	 */
	@ApiField("response")
	private InfoSecAnalyzeSyncResult response;

	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}
	public String getReqMsgId( ) {
		return this.reqMsgId;
	}

	public void setResponse(InfoSecAnalyzeSyncResult response) {
		this.response = response;
	}
	public InfoSecAnalyzeSyncResult getResponse( ) {
		return this.response;
	}

}
