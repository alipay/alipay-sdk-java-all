package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息模型
 *
 * @author auto create
 * @since 1.0, 2025-03-31 19:26:53
 */
public class LogisticsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6221945946486861485L;

	/**
	 * 配送时间,格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 履约商家信息，具体是由哪个商家履约的
	 */
	@ApiField("delivery_merchant_info")
	private DeliveryMerchantInfoDTO deliveryMerchantInfo;

	/**
	 * 配送时间,格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("delivery_start_time")
	private Date deliveryStartTime;

	/**
	 * 配送时间,格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("delivery_time")
	private Date deliveryTime;

	/**
	 * 物流类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public DeliveryMerchantInfoDTO getDeliveryMerchantInfo() {
		return this.deliveryMerchantInfo;
	}
	public void setDeliveryMerchantInfo(DeliveryMerchantInfoDTO deliveryMerchantInfo) {
		this.deliveryMerchantInfo = deliveryMerchantInfo;
	}

	public Date getDeliveryStartTime() {
		return this.deliveryStartTime;
	}
	public void setDeliveryStartTime(Date deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}

	public Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
