package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询抽佣规则
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:25
 */
public class AlipayCommerceCommissionRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7313138177788495143L;

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
