package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔垫付信息同步
 *
 * @author auto create
 * @since 1.0, 2022-08-29 12:03:41
 */
public class AlipayInsSceneClaimAdvancepaySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6158596248794645185L;

	/**
	 * 垫付信息
	 */
	@ApiField("advance_payment")
	private ClaimAdvancePaymentDTO advancePayment;

	/**
	 * 报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public ClaimAdvancePaymentDTO getAdvancePayment() {
		return this.advancePayment;
	}
	public void setAdvancePayment(ClaimAdvancePaymentDTO advancePayment) {
		this.advancePayment = advancePayment;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
