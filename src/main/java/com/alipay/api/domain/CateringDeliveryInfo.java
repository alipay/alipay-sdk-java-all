package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外卖配送信息
 *
 * @author auto create
 * @since 1.0, 2021-08-26 15:47:37
 */
public class CateringDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 5813126818488344173L;

	/**
	 * 骑手位置，单位是米。
	 */
	@ApiField("delivery_distance")
	private String deliveryDistance;

	/**
	 * 骑手联系方式（必须是虚拟号）
	 */
	@ApiField("delivery_mobile")
	private String deliveryMobile;

	/**
	 * 配送商信息。配送中及之后状态必填。
	 */
	@ApiField("distributor")
	private String distributor;

	/**
	 * 预计送达结束时间。如果是时间段，start和end都要填；如果是时间点，填入start。endtime需要大于starttime。
	 */
	@ApiField("estimate_delivery_end_time")
	private Date estimateDeliveryEndTime;

	/**
	 * 预计送达开始时间。如果是时间段，start和end都要填；如果是时间点，填入start。
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
