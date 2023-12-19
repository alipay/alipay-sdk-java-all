package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.docusign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:46:47
 */
public class AlipayBossProdAntlescenterDocusignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6125265432451475473L;

	/** 
	 * 电子签业务受理流水号
	 */
	@ApiField("sign_task_request_id")
	private String signTaskRequestId;

	public void setSignTaskRequestId(String signTaskRequestId) {
		this.signTaskRequestId = signTaskRequestId;
	}
	public String getSignTaskRequestId( ) {
		return this.signTaskRequestId;
	}

}
