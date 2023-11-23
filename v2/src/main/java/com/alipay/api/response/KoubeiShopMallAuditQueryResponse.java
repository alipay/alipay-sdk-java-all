package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.audit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:18:55
 */
public class KoubeiShopMallAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8824941147435475699L;

	/** 
	 * 审核备注
	 */
	@ApiField("audit_remark")
	private String auditRemark;

	/** 
	 * 工单审核状态：AUDITING 审核中，SUCCESS 通过，REJECTED 拒绝
	 */
	@ApiField("audit_status")
	private String auditStatus;

	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}
	public String getAuditRemark( ) {
		return this.auditRemark;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

}
