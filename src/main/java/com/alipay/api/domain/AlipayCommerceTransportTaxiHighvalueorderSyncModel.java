package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车高价值订单同步
 *
 * @author auto create
 * @since 1.0, 2022-04-02 17:53:19
 */
public class AlipayCommerceTransportTaxiHighvalueorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2443575897682259927L;

	/**
	 * 渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 调度费,单位:分
	 */
	@ApiField("dispatch_amount")
	private String dispatchAmount;

	/**
	 * 支付宝统一司机id
	 */
	@ApiField("driver_id")
	private String driverId;

	/**
	 * 预估价,单位:分
	 */
	@ApiField("estimate_amount")
	private String estimateAmount;

	/**
	 * 预估订单时长,单位:分钟
	 */
	@ApiField("estimate_duration")
	private String estimateDuration;

	/**
	 * 预估里程,单位:米
	 */
	@ApiField("estimate_mileage")
	private String estimateMileage;

	/**
	 * 预计接驾时间(实时单到达乘车点时间、预约单上车时间)
	 */
	@ApiField("estimate_pick_up_time")
	private String estimatePickUpTime;

	/**
	 * 外部订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 订单开始时间(实时单出发接驾时间、预约单匹配成功时间)
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDispatchAmount() {
		return this.dispatchAmount;
	}
	public void setDispatchAmount(String dispatchAmount) {
		this.dispatchAmount = dispatchAmount;
	}

	public String getDriverId() {
		return this.driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getEstimateAmount() {
		return this.estimateAmount;
	}
	public void setEstimateAmount(String estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	public String getEstimateDuration() {
		return this.estimateDuration;
	}
	public void setEstimateDuration(String estimateDuration) {
		this.estimateDuration = estimateDuration;
	}

	public String getEstimateMileage() {
		return this.estimateMileage;
	}
	public void setEstimateMileage(String estimateMileage) {
		this.estimateMileage = estimateMileage;
	}

	public String getEstimatePickUpTime() {
		return this.estimatePickUpTime;
	}
	public void setEstimatePickUpTime(String estimatePickUpTime) {
		this.estimatePickUpTime = estimatePickUpTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
