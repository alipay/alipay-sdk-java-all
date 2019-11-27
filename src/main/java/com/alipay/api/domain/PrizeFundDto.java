package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品资金信息
 *
 * @author auto create
 * @since 1.0, 2016-03-30 18:20:56
 */
public class PrizeFundDto extends AlipayObject {

	private static final long serialVersionUID = 7135373625311198167L;

	/**
	 * 预算信息
	 */
	@ApiField("budget")
	private BudgetInfo budget;

	/**
	 * 奖池编号
	 */
	@ApiField("prize_pool_id")
	private String prizePoolId;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	public BudgetInfo getBudget() {
		return this.budget;
	}
	public void setBudget(BudgetInfo budget) {
		this.budget = budget;
	}

	public String getPrizePoolId() {
		return this.prizePoolId;
	}
	public void setPrizePoolId(String prizePoolId) {
		this.prizePoolId = prizePoolId;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
