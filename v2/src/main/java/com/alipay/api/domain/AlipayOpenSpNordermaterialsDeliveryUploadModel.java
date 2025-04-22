package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N点餐物料物流信息上报
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:32:26
 */
public class AlipayOpenSpNordermaterialsDeliveryUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5199267269296471426L;

	/**
	 * 门店物料收货地址
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 需要发出的门店的物料个数，单位个
	 */
	@ApiField("materials_count")
	private Long materialsCount;

	/**
	 * 生产单号
	 */
	@ApiField("production_order_no")
	private String productionOrderNo;

	/**
	 * 门店物料收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人联系电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 门店单号，用于区分生产单号下的门店物料，与此前查询的对应
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	/**
	 * 门店下物流发出的物流单号
	 */
	@ApiField("tracking_number")
	private String trackingNumber;

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public Long getMaterialsCount() {
		return this.materialsCount;
	}
	public void setMaterialsCount(Long materialsCount) {
		this.materialsCount = materialsCount;
	}

	public String getProductionOrderNo() {
		return this.productionOrderNo;
	}
	public void setProductionOrderNo(String productionOrderNo) {
		this.productionOrderNo = productionOrderNo;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getShopOrderNo() {
		return this.shopOrderNo;
	}
	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}
