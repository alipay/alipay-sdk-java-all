package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-05-27 16:26:36
 */
public class AlipayCommerceTransportTaxiOrderinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6597657383194784988L;

	/**
	 * 订单渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 调度费(单位:分)
	 */
	@ApiField("dispatcher_amount")
	private String dispatcherAmount;

	/**
	 * 出租车订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 请求时间，Unix Timestamp单位毫秒
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 出租车订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝域内唯一司机id
	 */
	@ApiField("sys_driver_id")
	private String sysDriverId;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDispatcherAmount() {
		return this.dispatcherAmount;
	}
	public void setDispatcherAmount(String dispatcherAmount) {
		this.dispatcherAmount = dispatcherAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSysDriverId() {
		return this.sysDriverId;
	}
	public void setSysDriverId(String sysDriverId) {
		this.sysDriverId = sysDriverId;
	}

}
