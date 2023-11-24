package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔减奖品模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class SingleDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 1245731624997445873L;

	/**
	 * 预算id
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id,新增不传，修改传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 折扣幅度只能填写数字，大于0，小数点后最多2位，整数部分不能超过8位
	 */
	@ApiField("reduce_amt")
	private String reduceAmt;

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

	public String getReduceAmt() {
		return this.reduceAmt;
	}
	public void setReduceAmt(String reduceAmt) {
		this.reduceAmt = reduceAmt;
	}

}
