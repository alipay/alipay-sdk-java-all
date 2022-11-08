package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统模板消息发送
 *
 * @author auto create
 * @since 1.0, 2022-05-09 16:42:47
 */
public class AlipayEcoMycarSystemTemplatemessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 2392525915132386548L;

	/**
	 * 消息类容
	 */
	@ApiField("msg_content")
	private MsgContent msgContent;

	/**
	 * 消息动态信息,支持商户可透传自定义内容消息，当消息类型为VEHICLE_IOV_CONTROL，则可支持品牌名称
	 */
	@ApiListField("msg_dynamic_datas")
	@ApiField("msg_dynamic_data")
	private List<MsgDynamicData> msgDynamicDatas;

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

	public List<MsgDynamicData> getMsgDynamicDatas() {
		return this.msgDynamicDatas;
	}
	public void setMsgDynamicDatas(List<MsgDynamicData> msgDynamicDatas) {
		this.msgDynamicDatas = msgDynamicDatas;
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
