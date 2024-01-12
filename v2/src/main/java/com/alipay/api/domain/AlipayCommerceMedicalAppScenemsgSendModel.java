package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗场景消息发送接口
 *
 * @author auto create
 * @since 1.0, 2023-06-06 10:28:29
 */
public class AlipayCommerceMedicalAppScenemsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 6173932917323767856L;

	/**
	 * 消息参数列表
	 */
	@ApiListField("msg_arg_list")
	@ApiField("medical_app_scene_msg_send_arg")
	private List<MedicalAppSceneMsgSendArg> msgArgList;

	/**
	 * 外部自身的消息id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 消息模板码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 支付宝用户open_id
	 */
	@ApiField("to_open_id")
	private String toOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public List<MedicalAppSceneMsgSendArg> getMsgArgList() {
		return this.msgArgList;
	}
	public void setMsgArgList(List<MedicalAppSceneMsgSendArg> msgArgList) {
		this.msgArgList = msgArgList;
	}

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getToOpenId() {
		return this.toOpenId;
	}
	public void setToOpenId(String toOpenId) {
		this.toOpenId = toOpenId;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
