package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardTemplateConfig;
import com.alipay.api.domain.MemberCardPayEffectiveRule;
import com.alipay.api.domain.MemberCardPrepaidPromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-10 14:02:28
 */
public class AntMerchantExpandMembercardConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1563918164448936588L;

	/** 
	 * 安心充会员卡面的详细信息
	 */
	@ApiField("card_template_config")
	private MemberCardTemplateConfig cardTemplateConfig;

	/** 
	 * 会员产品id
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/** 
	 * 安心充会员卡核销的范围，可以为空，空就表示能核销商家下面的所有线下店；支持三类规则 1. 特定用户下面的线下店范围，暂时就支持当前商家名下的线下店范围。 2. 当前商家（M4）对应的smid -（暂未开放） 3. 限定特定的商品，如果同时存在，则只判断包含规则。 当前限定了2，就不能生效1的规则。
	 */
	@ApiField("pay_effective_rule")
	private MemberCardPayEffectiveRule payEffectiveRule;

	/** 
	 * 最大数量为5，安心充储值会有方案列表
	 */
	@ApiListField("prepaid_promotion_plans")
	@ApiField("member_card_prepaid_promotion_plan_info")
	private List<MemberCardPrepaidPromotionPlanInfo> prepaidPromotionPlans;

	public void setCardTemplateConfig(MemberCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}
	public MemberCardTemplateConfig getCardTemplateConfig( ) {
		return this.cardTemplateConfig;
	}

	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}
	public String getMemberProductId( ) {
		return this.memberProductId;
	}

	public void setPayEffectiveRule(MemberCardPayEffectiveRule payEffectiveRule) {
		this.payEffectiveRule = payEffectiveRule;
	}
	public MemberCardPayEffectiveRule getPayEffectiveRule( ) {
		return this.payEffectiveRule;
	}

	public void setPrepaidPromotionPlans(List<MemberCardPrepaidPromotionPlanInfo> prepaidPromotionPlans) {
		this.prepaidPromotionPlans = prepaidPromotionPlans;
	}
	public List<MemberCardPrepaidPromotionPlanInfo> getPrepaidPromotionPlans( ) {
		return this.prepaidPromotionPlans;
	}

}
