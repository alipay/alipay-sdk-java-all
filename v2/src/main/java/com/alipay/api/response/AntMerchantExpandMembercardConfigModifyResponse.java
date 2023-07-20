package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardTemplateConfig;
import com.alipay.api.domain.MemberCardPayEffectiveRule;
import com.alipay.api.domain.MemberCardPrepaidPromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.config.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:56:30
 */
public class AntMerchantExpandMembercardConfigModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2191963241763888277L;

	/** 
	 * 最新的卡模版配置
	 */
	@ApiField("card_template_config")
	private MemberCardTemplateConfig cardTemplateConfig;

	/** 
	 * 商家的安心充配置的唯一编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
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
