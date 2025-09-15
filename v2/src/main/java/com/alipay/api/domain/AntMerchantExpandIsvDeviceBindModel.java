package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具绑定门店
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:24:33
 */
public class AntMerchantExpandIsvDeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 2582795927934998719L;

	/**
	 * 机具使用场景：
团餐：CATERING_DEVICE；
快消：FMCG_DEVICE
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 设备编号。由各个供应商自己定义的设备标识，和供应商编号确定设备的唯一性
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 物料模板id，每个物料模板对应的唯一标识，由蚂蚁金服物料平台管理
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 开放平台机具申请单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 门店id。ISV为商家创建的门店对应的唯一标识
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 供应商编号。由蚂蚁金服为每个供应商分配的唯一标识
	 */
	@ApiField("supplier_no")
	private String supplierNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSupplierNo() {
		return this.supplierNo;
	}
	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

}
