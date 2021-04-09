package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外卖配送信息
 *
 * @author auto create
 * @since 1.0, 2021-04-08 19:40:36
 */
public class CateringDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 5854236696234395527L;

	/**
	 * 骑手位置（距离多少公里）
	 */
	@ApiField("delivery_distance")
	private String deliveryDistance;

	/**
	 * 骑手联系方式（必须是虚拟号）
	 */
	@ApiField("delivery_mobile")
	private String deliveryMobile;

	/**
	 * 配送商信息
	 */
	@ApiField("distributor")
	private String distributor;

	/**
	 * 预计送达结束时间（结束时间大于开始时间）
	 */
	@ApiField("estimate_delivery_end_time")
	private Date estimateDeliveryEndTime;

	/**
	 * 预计送达开始时间
	 */
	@ApiField("estimate_delivery_start_time")
	private Date estimateDeliveryStartTime;

	public String getDeliveryDistance() {
		return this.deliveryDistance;
	}
	public void setDeliveryDistance(String deliveryDistance) {
		this.deliveryDistance = deliveryDistance;
	}

	public String getDeliveryMobile() {
		return this.deliveryMobile;
	}
	public void setDeliveryMobile(String deliveryMobile) {
		this.deliveryMobile = deliveryMobile;
	}

	public String getDistributor() {
		return this.distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public Date getEstimateDeliveryEndTime() {
		return this.estimateDeliveryEndTime;
	}
	public void setEstimateDeliveryEndTime(Date estimateDeliveryEndTime) {
		this.estimateDeliveryEndTime = estimateDeliveryEndTime;
	}

	public Date getEstimateDeliveryStartTime() {
		return this.estimateDeliveryStartTime;
	}
	public void setEstimateDeliveryStartTime(Date estimateDeliveryStartTime) {
		this.estimateDeliveryStartTime = estimateDeliveryStartTime;
	}

}
