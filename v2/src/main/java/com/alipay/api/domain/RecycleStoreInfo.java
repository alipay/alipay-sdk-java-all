package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收门店信息
 *
 * @author auto create
 * @since 1.0, 2025-04-25 17:00:10
 */
public class RecycleStoreInfo extends AlipayObject {

	private static final long serialVersionUID = 4734521478454914619L;

	/**
	 * 门店详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 到店时间
	 */
	@ApiField("best_time")
	private String bestTime;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门店联系电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店Id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBestTime() {
		return this.bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
