package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.premium.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class AlipayOpenAppItemPremiumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8685282392255137156L;

	/** 
	 * 审核状态，包含：审核中（AUDITING）、审核通过（ENABLED）、审核驳回（REJECTED）、审核撤销（CANCELED）、已暂停（SUSPEND）、已终止（TERMINATED）
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

}
