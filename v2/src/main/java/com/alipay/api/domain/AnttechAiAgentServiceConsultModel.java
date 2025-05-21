package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AICO数字人Agent服务咨询接口
 *
 * @author auto create
 * @since 1.0, 2024-09-12 19:27:32
 */
public class AnttechAiAgentServiceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7354829275465998275L;

	/**
	 * 用户标识ID。不同用户下的会话是隔离的，互不影响。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 硬件设备信息
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/**
	 * 提问的消息体
	 */
	@ApiField("message")
	private String message;

	/**
	 * 请求的唯一标识，同一个serviceId下，不同请求的requestId需要唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务场景标识，对应不同的服务场景，每个服务场景对应不同的配置，如访问的大模型类型、版本、依赖的知识库等等
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 如果客户端有显示的会话管理功能，可以传会话ID，不同会话的上下文是隔离的。如果终端没有会话管理功能，可以不传。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 是否流式响应
	 */
	@ApiField("stream")
	private Boolean stream;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Boolean getStream() {
		return this.stream;
	}
	public void setStream(Boolean stream) {
		this.stream = stream;
	}

}
