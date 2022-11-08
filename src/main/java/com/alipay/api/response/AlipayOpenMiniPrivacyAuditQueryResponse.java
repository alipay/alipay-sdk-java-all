package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.privacy.audit.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-20 15:10:39
 */
public class AlipayOpenMiniPrivacyAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1853589175761677238L;

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
