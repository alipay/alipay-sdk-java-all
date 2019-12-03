package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点餐设置中每一个店铺的配置信息
 *
 * @author auto create
 * @since 1.0, 2019-01-17 11:55:36
 */
public class ShopOrderConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 8615672826857515228L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 店铺营业状态：
可枚举：
(1)OPEN 营业
(2)CLOSE 休息
	 */
	@ApiField("order_entry_status")
	private String orderEntryStatus;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店编号；最长32位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性。
	 */
	@ApiField("store_id")
	private String storeId;

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getOrderEntryStatus() {
		return this.orderEntryStatus;
	}
	public void setOrderEntryStatus(String orderEntryStatus) {
		this.orderEntryStatus = orderEntryStatus;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
