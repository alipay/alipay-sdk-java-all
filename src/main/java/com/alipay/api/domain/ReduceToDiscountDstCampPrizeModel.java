package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 减至指定折扣奖品模型
 *
 * @author auto create
 * @since 1.0, 2018-10-22 17:53:22
 */
public class ReduceToDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 8188168577315561697L;

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
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 折扣幅度减至必须为0.3到1之间的小数(保留小数点后2位)
	 */
	@ApiField("reduce_to_discount_rate")
	private String reduceToDiscountRate;

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

	public String getReduceToDiscountRate() {
		return this.reduceToDiscountRate;
	}
	public void setReduceToDiscountRate(String reduceToDiscountRate) {
		this.reduceToDiscountRate = reduceToDiscountRate;
	}

}
