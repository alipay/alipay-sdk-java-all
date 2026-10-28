package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步伙伴业绩结算审批状态
 *
 * @author auto create
 * @since 1.0, 2026-10-28 10:33:00
 */
public class AnttechOceanbaseObglobalCrmapprovalModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3449435675412558716L;

	/**
	 * 审批通过：APPROVED
拒绝：REJECTED
代审批：
PENDING
	 */
	@ApiField("crm_approval_status")
	private String crmApprovalStatus;

	/**
	 * 变更人（CRM 操作人或系统标识）
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * 付款结算业务单号
	 */
	@ApiField("payment_settlement_no")
	private String paymentSettlementNo;

	public String getCrmApprovalStatus() {
		return this.crmApprovalStatus;
	}
	public void setCrmApprovalStatus(String crmApprovalStatus) {
		this.crmApprovalStatus = crmApprovalStatus;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getPaymentSettlementNo() {
		return this.paymentSettlementNo;
	}
	public void setPaymentSettlementNo(String paymentSettlementNo) {
		this.paymentSettlementNo = paymentSettlementNo;
	}

}
