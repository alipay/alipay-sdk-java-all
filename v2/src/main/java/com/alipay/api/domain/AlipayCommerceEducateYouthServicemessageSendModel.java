package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成长派服务消息发送
 *
 * @author auto create
 * @since 1.0, 2023-11-03 15:24:53
 */
public class AlipayCommerceEducateYouthServicemessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 3289695863563938397L;

	/**
	 * 业务类型，用于区分不同业务场景
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 消息发送者AppId
	 */
	@ApiField("from_app_id")
	private String fromAppId;

	/**
	 * 扩展信息
	 */
	@ApiField("message_properties")
	private String messageProperties;

	/**
	 * 消息枚举
	 */
	@ApiField("msg_enum")
	private String msgEnum;

	/**
	 * 消息接收者openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号（唯一幂等）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 消息接收者UID
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getFromAppId() {
		return this.fromAppId;
	}
	public void setFromAppId(String fromAppId) {
		this.fromAppId = fromAppId;
	}

	public String getMessageProperties() {
		return this.messageProperties;
	}
	public void setMessageProperties(String messageProperties) {
		this.messageProperties = messageProperties;
	}

	public String getMsgEnum() {
		return this.msgEnum;
	}
	public void setMsgEnum(String msgEnum) {
		this.msgEnum = msgEnum;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
