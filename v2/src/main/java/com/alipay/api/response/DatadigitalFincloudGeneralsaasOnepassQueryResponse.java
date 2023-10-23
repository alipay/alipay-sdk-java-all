package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.onepass.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:43
 */
public class DatadigitalFincloudGeneralsaasOnepassQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6891267166765788324L;

	/** 
	 * 一键登录状态。PROCESSING：初始化；SUCCESS：本机校验成功（页面输入的手机号与当前流量卡号一致）；FAIL：本机校验失败（页面输入的手机号与当前流量卡号不一致）。
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
