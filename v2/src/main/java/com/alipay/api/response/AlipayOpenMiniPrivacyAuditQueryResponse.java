package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.privacy.audit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:24:05
 */
public class AlipayOpenMiniPrivacyAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626421635948537167L;

	/** 
	 * 隐私政策审批状态
INIT: 未填写，
AUDITING：审核中.
PASS：通过，
REJECT：驳回
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
