package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部平台消息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-06-12 11:40:47
 */
public class AlipayCommerceMedicalMessageNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1277781144249519437L;

	/**
	 * 业务来源
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 预期发送时间，不填默认即时发送
	 */
	@ApiField("expect_time")
	private Date expectTime;

	/**
	 * 医疗场景小程序消息发送参数
	 */
	@ApiListField("msg_arg_list")
	@ApiField("medical_medmsg_arg")
	private List<MedicalMedmsgArg> msgArgList;

	/**
	 * 外部消息id，保持幂等
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 发送消息的模板code
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 接收人的支付宝用户openID
	 */
	@ApiField("to_open_id")
	private String toOpenId;

	/**
	 * 接收人的支付宝用户ID
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getExpectTime() {
		return this.expectTime;
	}
	public void setExpectTime(Date expectTime) {
		this.expectTime = expectTime;
	}

	public List<MedicalMedmsgArg> getMsgArgList() {
		return this.msgArgList;
	}
	public void setMsgArgList(List<MedicalMedmsgArg> msgArgList) {
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
