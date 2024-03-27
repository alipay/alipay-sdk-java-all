package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Iot核身回端消息发送
 *
 * @author auto create
 * @since 1.0, 2024-01-12 10:59:07
 */
public class AlipayOpenIotmbsVerificationeventSendModel extends AlipayObject {

	private static final long serialVersionUID = 4446924171923533229L;

	/**
	 * 业务事件，唯一标识一个具体的业务事件。由对接业务的支付宝产品负责人提供。
	 */
	@ApiField("event")
	private String event;

	/**
	 * 展现在用户侧的业务信息。
	 */
	@ApiField("event_params")
	private String eventParams;

	/**
	 * 唯一标识事件流，例如订单号。与支付宝业务对接人沟通是否需要填写
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 用户刷脸核身的唯一标识
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 请求id，用作幂等。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 刷脸设备的唯一标识
	 */
	@ApiField("sn")
	private String sn;

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventParams() {
		return this.eventParams;
	}
	public void setEventParams(String eventParams) {
		this.eventParams = eventParams;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
