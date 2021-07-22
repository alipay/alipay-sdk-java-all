package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能终端设备同步
 *
 * @author auto create
 * @since 1.0, 2020-10-26 09:57:22
 */
public class AlipayMsaasItapDeviceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2413518918179227728L;

	/**
	 * 设备同步消息体
	 */
	@ApiListField("payload")
	@ApiField("device_sync_payload")
	private List<DeviceSyncPayload> payload;

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

	public List<DeviceSyncPayload> getPayload() {
		return this.payload;
	}
	public void setPayload(List<DeviceSyncPayload> payload) {
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
