package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询抽佣规则
 *
 * @author auto create
 * @since 1.0, 2025-12-22 14:37:46
 */
public class AlipayCommerceCommissionRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2269423485452512165L;

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
