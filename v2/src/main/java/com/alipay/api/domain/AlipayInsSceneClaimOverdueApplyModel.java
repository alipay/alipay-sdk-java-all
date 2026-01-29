package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔追偿
 *
 * @author auto create
 * @since 1.0, 2025-11-05 18:09:57
 */
public class AlipayInsSceneClaimOverdueApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5249698459856827398L;

	/**
	 * 追偿业务扩展字段
	 */
	@ApiField("biz_data")
	private InsClaimOverdueBizData bizData;

	/**
	 * 赔案单号（用于幂等控制）
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 追偿支出账号
	 */
	@ApiField("out_account_no")
	private String outAccountNo;

	/**
	 * 外部订单单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 追偿金额（单位是分）
	 */
	@ApiField("overdue_amount")
	private Long overdueAmount;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 关联保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public InsClaimOverdueBizData getBizData() {
		return this.bizData;
	}
	public void setBizData(InsClaimOverdueBizData bizData) {
		this.bizData = bizData;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getOutAccountNo() {
		return this.outAccountNo;
	}
	public void setOutAccountNo(String outAccountNo) {
		this.outAccountNo = outAccountNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Long getOverdueAmount() {
		return this.overdueAmount;
	}
	public void setOverdueAmount(Long overdueAmount) {
		this.overdueAmount = overdueAmount;
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

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

}
