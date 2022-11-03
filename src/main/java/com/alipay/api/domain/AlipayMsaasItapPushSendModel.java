package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能设备变更发送消息通知
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:41:00
 */
public class AlipayMsaasItapPushSendModel extends AlipayObject {

	private static final long serialVersionUID = 6625499245179348185L;

	/**
	 * 设备消息通知消息体
	 */
	@ApiListField("payload")
	@ApiField("device_push_payload")
	private List<DevicePushPayload> payload;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 对外使用的唯一用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<DevicePushPayload> getPayload() {
		return this.payload;
	}
	public void setPayload(List<DevicePushPayload> payload) {
		this.payload = payload;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
