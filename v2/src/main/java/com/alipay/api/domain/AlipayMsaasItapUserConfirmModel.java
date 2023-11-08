package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 验证支付宝用户Token是否有效
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:41:42
 */
public class AlipayMsaasItapUserConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6556791887591776196L;

	/**
	 * 用户确认消息体
	 */
	@ApiListField("payload")
	@ApiField("user_confirm_payload")
	private List<UserConfirmPayload> payload;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<UserConfirmPayload> getPayload() {
		return this.payload;
	}
	public void setPayload(List<UserConfirmPayload> payload) {
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
