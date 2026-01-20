package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消抽佣规则
 *
 * @author auto create
 * @since 1.0, 2025-12-10 15:02:21
 */
public class AlipayCommerceEcCommissionRuleCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5251865872891944127L;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	/**
	 * 抽佣规则id，用于取消指定的抽佣规则；
通过查询门店配置的抽佣规则获取。
	 */
	@ApiField("rule_id")
	private String ruleId;

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
