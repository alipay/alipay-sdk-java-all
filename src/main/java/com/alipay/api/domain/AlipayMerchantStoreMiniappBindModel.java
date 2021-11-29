package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝门店绑定默认小程序
 *
 * @author auto create
 * @since 1.0, 2020-12-04 15:16:03
 */
public class AlipayMerchantStoreMiniappBindModel extends AlipayObject {

	private static final long serialVersionUID = 7192548944963345985L;

	/**
	 * 门店小程序绑定操作的类型，分为以下枚举类型：
- STORE_DEFAULT_MINIAPP，门店默认小程序
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 门店和小程序绑定映射关系
	 */
	@ApiListField("shop_app_relation")
	@ApiField("shop_app_relation")
	private List<ShopAppRelation> shopAppRelation;

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<ShopAppRelation> getShopAppRelation() {
		return this.shopAppRelation;
	}
	public void setShopAppRelation(List<ShopAppRelation> shopAppRelation) {
		this.shopAppRelation = shopAppRelation;
	}

}
