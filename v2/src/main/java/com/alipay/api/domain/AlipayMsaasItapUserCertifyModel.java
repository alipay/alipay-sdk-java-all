package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Auth授权token回调接口
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:42:15
 */
public class AlipayMsaasItapUserCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7581749576122379842L;

	/**
	 * 用户认证消息体
	 */
	@ApiListField("payload")
	@ApiField("user_certify_payload")
	private List<UserCertifyPayload> payload;

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

	public List<UserCertifyPayload> getPayload() {
		return this.payload;
	}
	public void setPayload(List<UserCertifyPayload> payload) {
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
