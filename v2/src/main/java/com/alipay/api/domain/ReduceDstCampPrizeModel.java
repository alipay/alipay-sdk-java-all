package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满立减奖品模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ReduceDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 2645765926329883192L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id, 修改必输，新增不输入
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 满的金额只能填写正整数字，大于0，必须小于9位
	 */
	@ApiField("reduce_amt_pre")
	private String reduceAmtPre;

	/**
	 * 减的金额只能填写数字，大于0，小数点后最多2位，整数部分不能超过8位
	 */
	@ApiField("reduce_amt_suf")
	private String reduceAmtSuf;

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

	public String getReduceAmtPre() {
		return this.reduceAmtPre;
	}
	public void setReduceAmtPre(String reduceAmtPre) {
		this.reduceAmtPre = reduceAmtPre;
	}

	public String getReduceAmtSuf() {
		return this.reduceAmtSuf;
	}
	public void setReduceAmtSuf(String reduceAmtSuf) {
		this.reduceAmtSuf = reduceAmtSuf;
	}

}
