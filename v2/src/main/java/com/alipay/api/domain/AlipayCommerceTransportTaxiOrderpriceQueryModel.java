package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车订单价格查询
 *
 * @author auto create
 * @since 1.0, 2022-05-13 20:32:47
 */
public class AlipayCommerceTransportTaxiOrderpriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6494961814195229339L;

	/**
	 * 订单渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

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

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
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

}
