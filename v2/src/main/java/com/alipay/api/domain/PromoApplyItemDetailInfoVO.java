package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销申领商品优惠详情
 *
 * @author auto create
 * @since 1.0, 2023-08-04 13:53:35
 */
public class PromoApplyItemDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1513185859531284251L;

	/**
	 * 优惠申领金额或者数量，金额时单位为分
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 优惠申领的预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 会员等级
	 */
	@ApiField("member_level")
	private String memberLevel;

	/**
	 * 营销优惠子类型
	 */
	@ApiField("promotion_sub_type")
	private String promotionSubType;

	/**
	 * 营销优惠类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getMemberLevel() {
		return this.memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getPromotionSubType() {
		return this.promotionSubType;
	}
	public void setPromotionSubType(String promotionSubType) {
		this.promotionSubType = promotionSubType;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

}
