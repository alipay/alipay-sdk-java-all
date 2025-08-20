package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益账户退款
 *
 * @author auto create
 * @since 1.0, 2025-08-01 17:19:03
 */
public class AlipayMarketingBenefitaccountAccountRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8755396437757561667L;

	/**
	 * 本次操作退款总金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 权益账户号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/**
	 * 本次退款业务订单号，用于幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 预算退款类型：扣减
	 */
	@ApiField("budget_decrease_type")
	private String budgetDecreaseType;

	/**
	 * 退款资金操作明细
	 */
	@ApiListField("fund_infos")
	@ApiField("fs_fund_info_form")
	private List<FsFundInfoForm> fundInfos;

	/**
	 * 退款操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 退款操作人名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 权益账户归属人用户ID
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	/**
	 * 退款策略，默认是业务分配退款策略，biz_alloc
	 */
	@ApiField("refund_strategy")
	private String refundStrategy;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBenefitAccountNo() {
		return this.benefitAccountNo;
	}
	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBudgetDecreaseType() {
		return this.budgetDecreaseType;
	}
	public void setBudgetDecreaseType(String budgetDecreaseType) {
		this.budgetDecreaseType = budgetDecreaseType;
	}

	public List<FsFundInfoForm> getFundInfos() {
		return this.fundInfos;
	}
	public void setFundInfos(List<FsFundInfoForm> fundInfos) {
		this.fundInfos = fundInfos;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

	public String getRefundStrategy() {
		return this.refundStrategy;
	}
	public void setRefundStrategy(String refundStrategy) {
		this.refundStrategy = refundStrategy;
	}

}
