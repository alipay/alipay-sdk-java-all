package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能终端设备状态同步
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:40:44
 */
public class AlipayMsaasItapStatesSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6797822536617193642L;

	/**
	 * 状态同步消息体
	 */
	@ApiListField("payload")
	@ApiField("states_sync_payload")
	private List<StatesSyncPayload> payload;

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

	public List<StatesSyncPayload> getPayload() {
		return this.payload;
	}
	public void setPayload(List<StatesSyncPayload> payload) {
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
