package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀主动还款申请
 *
 * @author auto create
 * @since 1.0, 2025-09-12 16:15:29
 */
public class AlipayPcreditLoanHonorRepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1392651232988629531L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 预算时返回的总金额（还款试算不传金额时返回的总金额）
	 */
	@ApiField("budget_amount")
	private String budgetAmount;

	/**
	 * 预算时返回的利息（还款试算不传金额时返回的利息）
	 */
	@ApiField("budget_interest")
	private String budgetInterest;

	/**
	 * 预算时返回的罚息（还款试算不传金额时返回的罚息）
	 */
	@ApiField("budget_penalty")
	private String budgetPenalty;

	/**
	 * 预算时返回的本金（还款试算不传金额时返回的本金）
	 */
	@ApiField("budget_principal")
	private String budgetPrincipal;

	/**
	 * 预算类型 
ADVANCE_REPAY-结清预算
OVD_AND_CURRENT_REPAY-到期逾期预算
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 荣耀用户ID
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁侧借款订单单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部追踪ID
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * 渠道产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户申请的还款金额，单位：分
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 荣耀侧还款交易流水号
	 */
	@ApiField("repay_no")
	private String repayNo;

	/**
	 * 请求来源
CUSTOMER-C端对应用户发起、SCHEDULER-调度发起、BACKDOOR-小二对应后台用户调用
	 */
	@ApiField("request_source")
	private String requestSource;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBudgetAmount() {
		return this.budgetAmount;
	}
	public void setBudgetAmount(String budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getBudgetInterest() {
		return this.budgetInterest;
	}
	public void setBudgetInterest(String budgetInterest) {
		this.budgetInterest = budgetInterest;
	}

	public String getBudgetPenalty() {
		return this.budgetPenalty;
	}
	public void setBudgetPenalty(String budgetPenalty) {
		this.budgetPenalty = budgetPenalty;
	}

	public String getBudgetPrincipal() {
		return this.budgetPrincipal;
	}
	public void setBudgetPrincipal(String budgetPrincipal) {
		this.budgetPrincipal = budgetPrincipal;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayNo() {
		return this.repayNo;
	}
	public void setRepayNo(String repayNo) {
		this.repayNo = repayNo;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

}
