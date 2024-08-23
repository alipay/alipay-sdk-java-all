package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡线下核销规则
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardPayEffectiveRule extends AlipayObject {

	private static final long serialVersionUID = 1542516622838333363L;

	/**
	 * 会员卡线下核销的商品规则
	 */
	@ApiField("item_rule")
	private MemberCardPayEffectiveItemRule itemRule;

	/**
	 * 线下店核销范围规则
	 */
	@ApiListField("shop_rules")
	@ApiField("member_card_pay_effective_shop_rule")
	private List<MemberCardPayEffectiveShopRule> shopRules;

	/**
	 * 间连商家的编号列表，暂不支持，最大列表数为0
	 */
	@ApiListField("smids")
	@ApiField("string")
	private List<String> smids;

	public MemberCardPayEffectiveItemRule getItemRule() {
		return this.itemRule;
	}
	public void setItemRule(MemberCardPayEffectiveItemRule itemRule) {
		this.itemRule = itemRule;
	}

	public List<MemberCardPayEffectiveShopRule> getShopRules() {
		return this.shopRules;
	}
	public void setShopRules(List<MemberCardPayEffectiveShopRule> shopRules) {
		this.shopRules = shopRules;
	}

	public List<String> getSmids() {
		return this.smids;
	}
	public void setSmids(List<String> smids) {
		this.smids = smids;
	}

}
