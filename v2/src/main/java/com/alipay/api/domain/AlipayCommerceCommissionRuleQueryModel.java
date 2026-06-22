package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询抽佣规则
 *
 * @author auto create
 * @since 1.0, 2026-06-17 10:52:56
 */
public class AlipayCommerceCommissionRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2445157292257938134L;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

}
