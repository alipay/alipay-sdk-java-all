package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资关系组明细
 *
 * @author auto create
 * @since 1.0, 2025-08-29 11:05:55
 */
public class FsFundRelationDetailForm extends AlipayObject {

	private static final long serialVersionUID = 1131852268449515548L;

	/**
	 * 出资金额是否允许上浮，默认允许true
	 */
	@ApiField("allowed_float_up")
	private Boolean allowedFloatUp;

	/**
	 * 当预算不足时允许跳过预算扣减,默认false不允许
	 */
	@ApiField("allows_skip_budget_deduction")
	private Boolean allowsSkipBudgetDeduction;

	/**
	 * 出资封顶金额：“100.00”，单位元
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 出资主体
	 */
	@ApiField("fund_principal")
	private String fundPrincipal;

	/**
	 * 优先级，按顺序出资时必填，值越小优先级越大
	 */
	@ApiField("fund_priority")
	private Long fundPriority;

	/**
	 * 支付宝出资：PLATFORM
	 */
	@ApiField("fund_provider")
	private String fundProvider;

	/**
	 * 出资比例，按比例出资时必填，值必须是小于等于100的整数，如出资比例33%，值为33
	 */
	@ApiField("fund_ratio")
	private Long fundRatio;

	/**
	 * 出资类型余额：BALANCE
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 出资账号对应的用户ID
	 */
	@ApiField("fund_user_id")
	private String fundUserId;

	public Boolean getAllowedFloatUp() {
		return this.allowedFloatUp;
	}
	public void setAllowedFloatUp(Boolean allowedFloatUp) {
		this.allowedFloatUp = allowedFloatUp;
	}

	public Boolean getAllowsSkipBudgetDeduction() {
		return this.allowsSkipBudgetDeduction;
	}
	public void setAllowsSkipBudgetDeduction(Boolean allowsSkipBudgetDeduction) {
		this.allowsSkipBudgetDeduction = allowsSkipBudgetDeduction;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getFundPrincipal() {
		return this.fundPrincipal;
	}
	public void setFundPrincipal(String fundPrincipal) {
		this.fundPrincipal = fundPrincipal;
	}

	public Long getFundPriority() {
		return this.fundPriority;
	}
	public void setFundPriority(Long fundPriority) {
		this.fundPriority = fundPriority;
	}

	public String getFundProvider() {
		return this.fundProvider;
	}
	public void setFundProvider(String fundProvider) {
		this.fundProvider = fundProvider;
	}

	public Long getFundRatio() {
		return this.fundRatio;
	}
	public void setFundRatio(Long fundRatio) {
		this.fundRatio = fundRatio;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getFundUserId() {
		return this.fundUserId;
	}
	public void setFundUserId(String fundUserId) {
		this.fundUserId = fundUserId;
	}

}
