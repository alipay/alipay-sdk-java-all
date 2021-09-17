package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮订单对应服务信息
 *
 * @author auto create
 * @since 1.0, 2021-08-24 10:10:46
 */
public class CateringServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 4874677667576944742L;

	/**
	 * 服务子类型（ServiceSubType枚举）
自提:PICK_UP
外卖:TAKE_AWAY
排队:QUEUE
	 */
	@ApiField("service_sub_type")
	private String serviceSubType;

	/**
	 * 门店地址（格式：市/区/详细地址门牌号）
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 商家门店id（ISV内部门店唯一编号）
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称，比如：蚂蚁金服店
	 */
	@ApiField("store_name")
	private String storeName;

	public String getServiceSubType() {
		return this.serviceSubType;
	}
	public void setServiceSubType(String serviceSubType) {
		this.serviceSubType = serviceSubType;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
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
