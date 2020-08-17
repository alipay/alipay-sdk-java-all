package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-22 14:26:43
 */
public class AlipayMobilePublicInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1145995776142661381L;

	/** 
	 * 服务窗审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 服务窗审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

}
