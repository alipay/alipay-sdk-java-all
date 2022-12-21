package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联合营销消费券场景 券配置摘要信息
 *
 * @author auto create
 * @since 1.0, 2022-12-06 14:50:09
 */
public class UnitedVoucherDigest extends AlipayObject {

	private static final long serialVersionUID = 2595935552469394176L;

	/**
	 * 是否剩余预算
	 */
	@ApiField("budget_close")
	private Boolean budgetClose;

	/**
	 * 封顶金额（仅适用于折扣券）
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券折扣类型：满减券/折扣券
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 券满减门槛-满金额，单位：元
	 */
	@ApiField("from_amount")
	private String fromAmount;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 券折扣比例（仅适用于折扣券）
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 展示顺序
	 */
	@ApiField("show_order")
	private Long showOrder;

	/**
	 * 券满减门槛-减金额（仅适用于满减券），单位：元
	 */
	@ApiField("to_amount")
	private String toAmount;

	/**
	 * 券所属行业/类目
	 */
	@ApiField("voucher_biz_code")
	private String voucherBizCode;

	public Boolean getBudgetClose() {
		return this.budgetClose;
	}
	public void setBudgetClose(Boolean budgetClose) {
		this.budgetClose = budgetClose;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getFromAmount() {
		return this.fromAmount;
	}
	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getReductionRatio() {
		return this.reductionRatio;
	}
	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public Long getShowOrder() {
		return this.showOrder;
	}
	public void setShowOrder(Long showOrder) {
		this.showOrder = showOrder;
	}

	public String getToAmount() {
		return this.toAmount;
	}
	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}

	public String getVoucherBizCode() {
		return this.voucherBizCode;
	}
	public void setVoucherBizCode(String voucherBizCode) {
		this.voucherBizCode = voucherBizCode;
	}

}
