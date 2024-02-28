package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗订阅消息发送接口
 *
 * @author auto create
 * @since 1.0, 2023-11-09 21:24:16
 */
public class AlipayCommerceMedicalSubscribemsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 6751789976647667968L;

	/**
	 * 消息参数列表
	 */
	@ApiListField("msg_arg_list")
	@ApiField("medical_subscribe_msg_send_arg")
	private List<MedicalSubscribeMsgSendArg> msgArgList;

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

	public List<MedicalSubscribeMsgSendArg> getMsgArgList() {
		return this.msgArgList;
	}
	public void setMsgArgList(List<MedicalSubscribeMsgSendArg> msgArgList) {
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
