package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品规则规则查询通用API
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:40:04
 */
public class KoubeiCateringDishRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6425111655174122896L;

	/**
	 * 规则的类型，枚举值如下：
DEFAULT_IN_CARTS  // "开台默认菜";
NON_WHOLE_ORDER_DISCOUNT", //"不参与整单优惠的菜";
MUST_IN_ORDER // "下单必点菜";
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 当查询规则类型biz_type为DEFAULT_IN_CARTS，即开台默认菜的时候，本项必填。
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
