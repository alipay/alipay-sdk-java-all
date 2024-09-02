package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家安心充配置保存
 *
 * @author auto create
 * @since 1.0, 2022-04-25 11:08:22
 */
public class AntMerchantExpandMembercardConfigSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8268879385367979825L;

	/**
	 * 安心充会员卡面的详细信息
	 */
	@ApiField("card_template_config")
	private MemberCardTemplateConfig cardTemplateConfig;

	/**
	 * 操作会员卡的角色信息，参数设置方式参考：接入指南 的说明
	 */
	@ApiField("operator")
	private MemberCardOperator operator;

	/**
	 * 外部业务号，幂等判断
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 安心充会员卡核销的范围，可以为空，空就表示能核销商家下面的所有线下店；支持三类规则
1. 特定用户下面的线下店范围，暂时就支持当前商家名下的线下店范围。
 2. 当前商家（M4）对应的smid -（暂未开放）
 3. 限定特定的商品，如果同时存在，则只判断包含规则。

当前限定了2，就不能生效1的规则。

内部字段都是修改操作，如果字段内容为null，则表示不修改。
	 */
	@ApiField("pay_effective_rule")
	private MemberCardPayEffectiveRule payEffectiveRule;

	/**
	 * 最大数量为6，安心充储值会有方案列表
	 */
	@ApiListField("prepaid_promotion_plans")
	@ApiField("member_card_create_prepaid_promotion_plan_info")
	private List<MemberCardCreatePrepaidPromotionPlanInfo> prepaidPromotionPlans;

	public MemberCardTemplateConfig getCardTemplateConfig() {
		return this.cardTemplateConfig;
	}
	public void setCardTemplateConfig(MemberCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}

	public MemberCardOperator getOperator() {
		return this.operator;
	}
	public void setOperator(MemberCardOperator operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public MemberCardPayEffectiveRule getPayEffectiveRule() {
		return this.payEffectiveRule;
	}
	public void setPayEffectiveRule(MemberCardPayEffectiveRule payEffectiveRule) {
		this.payEffectiveRule = payEffectiveRule;
	}

	public List<MemberCardCreatePrepaidPromotionPlanInfo> getPrepaidPromotionPlans() {
		return this.prepaidPromotionPlans;
	}
	public void setPrepaidPromotionPlans(List<MemberCardCreatePrepaidPromotionPlanInfo> prepaidPromotionPlans) {
		this.prepaidPromotionPlans = prepaidPromotionPlans;
	}

}
