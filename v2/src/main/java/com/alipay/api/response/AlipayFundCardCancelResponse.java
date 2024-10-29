package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.card.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 17:52:04
 */
public class AlipayFundCardCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7774295268967835671L;

	/** 
	 * 作废流程的流程单据Id
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 返回接口执行结果，无业务返回字段
	 */
	@ApiField("status")
	private String status;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
