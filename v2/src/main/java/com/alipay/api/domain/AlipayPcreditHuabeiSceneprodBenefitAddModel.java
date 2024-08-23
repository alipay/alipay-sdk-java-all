package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗金权益预算追加
 *
 * @author auto create
 * @since 1.0, 2022-04-19 17:50:31
 */
public class AlipayPcreditHuabeiSceneprodBenefitAddModel extends AlipayObject {

	private static final long serialVersionUID = 4519452993671618752L;

	/**
	 * 权益ID，创建权益时返回的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 追加的预算金额
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

	/**
	 * 外部业务号，幂等ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 创建权益的支付宝商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 调用方来源
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 上游权益id
	 */
	@ApiField("upper_benefit_id")
	private String upperBenefitId;

	/**
	 * 上游业务商家id
	 */
	@ApiField("upper_seller_id")
	private String upperSellerId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public Long getBudgetAmount() {
		return this.budgetAmount;
	}
	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getUpperBenefitId() {
		return this.upperBenefitId;
	}
	public void setUpperBenefitId(String upperBenefitId) {
		this.upperBenefitId = upperBenefitId;
	}

	public String getUpperSellerId() {
		return this.upperSellerId;
	}
	public void setUpperSellerId(String upperSellerId) {
		this.upperSellerId = upperSellerId;
	}

}
