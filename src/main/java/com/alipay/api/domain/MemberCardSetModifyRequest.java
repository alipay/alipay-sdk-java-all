package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡修改请求参数
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardSetModifyRequest extends AlipayObject {

	private static final long serialVersionUID = 3695387588599341715L;

	/**
	 * 期望修改成的卡面信息
	 */
	@ApiField("card_template_config")
	private MemberCardTemplateConfig cardTemplateConfig;

	/**
	 * 商家的安心充配置的唯一编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/**
	 * 会员卡配置操作员信息，参数设置方式参考：接入指南 的说明
	 */
	@ApiField("operator")
	private MemberCardOperator operator;

	/**
	 * 安心充会员卡核销的范围，可以为空，空就表示能核销商家下面的所有线下店；支持三类规则 1. 特定用户下面的线下店范围，暂时就支持当前商家名下的线下店范围。 2. 当前商家（M4）对应的smid -（暂未开放） 3. 限定特定的商品，如果同时存在，则只判断包含规则。 当前限定了2，就不能生效1的规则。内部字段如果为null，则表示不修改已有配置。
	 */
	@ApiField("pay_effective_rule")
	private MemberCardPayEffectiveRule payEffectiveRule;

	/**
	 * 最大数量为6，期望修改成的优惠方案列表： 如果不包含现有的优惠方案对象，则表示期望删除； 如果包含了优惠对象，会校验充送方案是否存在，存在则修改（只支持修改状态），不存在则添加。
	 */
	@ApiField("prepaid_promotion_plans")
	private MemberCardCreatePrepaidPromotionPlanInfo prepaidPromotionPlans;

	public MemberCardTemplateConfig getCardTemplateConfig() {
		return this.cardTemplateConfig;
	}
	public void setCardTemplateConfig(MemberCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}

	public MemberCardOperator getOperator() {
		return this.operator;
	}
	public void setOperator(MemberCardOperator operator) {
		this.operator = operator;
	}

	public MemberCardPayEffectiveRule getPayEffectiveRule() {
		return this.payEffectiveRule;
	}
	public void setPayEffectiveRule(MemberCardPayEffectiveRule payEffectiveRule) {
		this.payEffectiveRule = payEffectiveRule;
	}

	public MemberCardCreatePrepaidPromotionPlanInfo getPrepaidPromotionPlans() {
		return this.prepaidPromotionPlans;
	}
	public void setPrepaidPromotionPlans(MemberCardCreatePrepaidPromotionPlanInfo prepaidPromotionPlans) {
		this.prepaidPromotionPlans = prepaidPromotionPlans;
	}

}
