package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardTemplateConfig;
import com.alipay.api.domain.MemberCardPayEffectiveRule;
import com.alipay.api.domain.MemberCardPrepaidPromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-18 14:10:32
 */
public class AntMerchantExpandMembercardOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5451487414314844424L;

	/** 
	 * 最新的卡模版配置
	 */
	@ApiField("card_template_config")
	private MemberCardTemplateConfig cardTemplateConfig;

	/** 
	 * 最新的核销范围
	 */
	@ApiField("pay_effective_rule")
	private MemberCardPayEffectiveRule payEffectiveRule;

	/** 
	 * 最新的优惠方案列表
	 */
	@ApiListField("prepaid_promotion_plans")
	@ApiField("member_card_prepaid_promotion_plan_info")
	private List<MemberCardPrepaidPromotionPlanInfo> prepaidPromotionPlans;

	/** 
	 * DRAFT: 草稿待确认
PROCESSING: 流程中
FINISH: 完成
	 */
	@ApiField("status")
	private String status;

	public void setCardTemplateConfig(MemberCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}
	public MemberCardTemplateConfig getCardTemplateConfig( ) {
		return this.cardTemplateConfig;
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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
