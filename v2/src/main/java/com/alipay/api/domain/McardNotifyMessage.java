package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知消息
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:55:50
 */
public class McardNotifyMessage extends AlipayObject {

	private static final long serialVersionUID = 4798997794957352562L;

	/**
	 * 用户提醒信息，按如下格式拼装，需要ISV提供change_reason。

积分变动模板：{change_reason}，您的积分有变动

余额变动模板：{change_reason}，您的余额有变动

等级变更无需提供原因。
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * JSON格式扩展信息，主要是发送消息中的变量
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息类型，每种消息都定义了固定消息模板
	 */
	@ApiField("message_type")
	private String messageType;

	public String getChangeReason() {
		return this.changeReason;
	}
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
