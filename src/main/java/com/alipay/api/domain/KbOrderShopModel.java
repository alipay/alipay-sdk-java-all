package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑在线购买订单-购买店铺模型
 *
 * @author auto create
 * @since 1.0, 2017-09-27 13:13:24
 */
public class KbOrderShopModel extends AlipayObject {

	private static final long serialVersionUID = 1826321431347673567L;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店外部ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
