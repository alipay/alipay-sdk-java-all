package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.flights.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 13:47:37
 */
public class AlipayCommerceTransportFlightsAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6848425533293457793L;

	/** 
	 * 授权状态。
限定取值：
authed：已授权、unauthed：未授权、revoked：取消授权
	 */
	@ApiField("auth_status")
	private String authStatus;

	/** 
	 * 外部业务号，唯一标志本次请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getAuthStatus( ) {
		return this.authStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
