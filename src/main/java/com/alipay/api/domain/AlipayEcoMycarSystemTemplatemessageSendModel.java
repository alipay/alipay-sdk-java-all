package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统模板消息发送
 *
 * @author auto create
 * @since 1.0, 2022-04-13 09:33:10
 */
public class AlipayEcoMycarSystemTemplatemessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 8681287949347665749L;

	/**
	 * 消息类容
	 */
	@ApiField("msg_content")
	private MsgContent msgContent;

	/**
	 * 消息业务id,唯一标记一条消息信息
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 消息主体id
如消息类型为：VEHICLE_IOV_CONTROL，则该字段表示当前车辆id
	 */
	@ApiField("msg_subject_id")
	private String msgSubjectId;

	/**
	 * VEHICLE_IOV_CONTROL-车联车控
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 跳转消息详情所需要的动态参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public MsgContent getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(MsgContent msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgSubjectId() {
		return this.msgSubjectId;
	}
	public void setMsgSubjectId(String msgSubjectId) {
		this.msgSubjectId = msgSubjectId;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
