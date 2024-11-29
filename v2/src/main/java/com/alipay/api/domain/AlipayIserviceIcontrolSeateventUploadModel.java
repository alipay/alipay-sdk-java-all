package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云小二坐席事件上报
 *
 * @author auto create
 * @since 1.0, 2024-07-24 20:04:14
 */
public class AlipayIserviceIcontrolSeateventUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4321249381539666396L;

	/**
	 * 客服呼入类坐席事件上报报文
	 */
	@ApiField("ic_inbound_seat_event_payload")
	private IcInboundSeatEventModel icInboundSeatEventPayload;

	/**
	 * 星云侧服务收单的唯一编号，跟service_uniq_code一一对应
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务单类型：
CUSTORMER_SERVICE_INBOUND: 客服-呼入类（客权客服
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 客服单次会话服务唯一标识,小二单次服务从接入到结束的唯一标识。若本次事件上报跟服务单相关，则该参数必填
	 */
	@ApiField("service_uniq_code")
	private String serviceUniqCode;

	public IcInboundSeatEventModel getIcInboundSeatEventPayload() {
		return this.icInboundSeatEventPayload;
	}
	public void setIcInboundSeatEventPayload(IcInboundSeatEventModel icInboundSeatEventPayload) {
		this.icInboundSeatEventPayload = icInboundSeatEventPayload;
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

	public String getServiceUniqCode() {
		return this.serviceUniqCode;
	}
	public void setServiceUniqCode(String serviceUniqCode) {
		this.serviceUniqCode = serviceUniqCode;
	}

}
