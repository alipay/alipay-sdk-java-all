package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 子门店信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 15:59:38
 */
public class SubShopInfo extends AlipayObject {

	private static final long serialVersionUID = 1317227298458182639L;

	/**
	 * 门店信息集合
	 */
	@ApiListField("shop_list")
	@ApiField("shop")
	private List<Shop> shopList;

	public List<Shop> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}

}
