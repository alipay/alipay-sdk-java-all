package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券商代销信托业务消息发送
 *
 * @author auto create
 * @since 1.0, 2023-05-19 11:50:00
 */
public class AntfortuneStockTrustMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 5372976347973515186L;

	/**
	 * 消息ID，用来唯一标识一条消息
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 消息参数
	 */
	@ApiField("message_params")
	private Kv messageParams;

	/**
	 * 消息类型
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 用户ID，对于机构而言，对应蚂蚁域内的唯一用户
	 */
	@ApiField("trust_user_id")
	private String trustUserId;

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Kv getMessageParams() {
		return this.messageParams;
	}
	public void setMessageParams(Kv messageParams) {
		this.messageParams = messageParams;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getTrustUserId() {
		return this.trustUserId;
	}
	public void setTrustUserId(String trustUserId) {
		this.trustUserId = trustUserId;
	}

}
