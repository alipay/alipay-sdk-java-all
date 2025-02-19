package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 方案任务奖品。
 *
 * @author auto create
 * @since 1.0, 2020-05-06 17:53:33
 */
public class AppletTaskPrizeVO extends AlipayObject {

	private static final long serialVersionUID = 7641791758314277656L;

	/**
	 * 奖品余额。
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

	/**
	 * 奖品系数。
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * 奖品id。
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称。
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	public Long getBudgetAmount() {
		return this.budgetAmount;
	}
	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
