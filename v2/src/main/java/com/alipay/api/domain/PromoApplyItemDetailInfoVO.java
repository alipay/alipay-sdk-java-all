package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销申领商品优惠详情
 *
 * @author auto create
 * @since 1.0, 2023-12-27 15:53:01
 */
public class PromoApplyItemDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4675681129645315538L;

	/**
	 * 优惠申领金额或者数量，金额时单位：分。需要根据budget_type字段区分金额和数量
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 优惠申领的预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 支付宝会员等级
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

	/**
	 * 子营销申领明细，包含子营销申领消耗的名称和数量
	 */
	@ApiListField("sub_promo_infos")
	@ApiField("sub_promo_info_v_o")
	private List<SubPromoInfoVO> subPromoInfos;

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

	public List<SubPromoInfoVO> getSubPromoInfos() {
		return this.subPromoInfos;
	}
	public void setSubPromoInfos(List<SubPromoInfoVO> subPromoInfos) {
		this.subPromoInfos = subPromoInfos;
	}

}
