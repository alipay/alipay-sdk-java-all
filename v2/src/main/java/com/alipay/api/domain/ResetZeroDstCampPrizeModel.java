package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抹零优惠模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ResetZeroDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 3242682424769957811L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单笔上限金额只能填写数字，大于等于0，小数点后最多2位，整数部分不能超过5位
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 对应的值分别为100,1000,10000,100000
小数点取整，交易金额必须大于1元，最大优惠幅度0.99元，EG：交易金额1.36元，取整后优惠后金额为1元
个位数取整，交易金额必须大于10元，最大优惠幅度9.99元，EG：交易金额13.56元，取整后优惠后金额为10元
十位数取整，交易金额必须大于100元，最大优惠幅度99.99元，EG：交易金额125.56元，取整后优惠后金额为100元
百位数取整，交易金额必须大于1000元，最大优惠幅度999.99元，EG：交易金额1125.56元，取整后优惠后金额为1000元
	 */
	@ApiField("reset_zero_amt")
	private String resetZeroAmt;

	public String getBudgetId() {
		return this.budgetId;
	}
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMaxDiscountAmt() {
		return this.maxDiscountAmt;
	}
	public void setMaxDiscountAmt(String maxDiscountAmt) {
		this.maxDiscountAmt = maxDiscountAmt;
	}

	public String getResetZeroAmt() {
		return this.resetZeroAmt;
	}
	public void setResetZeroAmt(String resetZeroAmt) {
		this.resetZeroAmt = resetZeroAmt;
	}

}
