package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部平台支付宝消息推送
 *
 * @author auto create
 * @since 1.0, 2025-06-25 10:11:38
 */
public class AlipayCommerceMedicalMedmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 1639271745195845195L;

	/**
	 * 来源业务
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 预期发送时间
	 */
	@ApiField("expect_time")
	private Date expectTime;

	/**
	 * 消息参数列表
	 */
	@ApiListField("msg_arg_list")
	@ApiField("medical_medmsg_arg")
	private List<MedicalMedmsgArg> msgArgList;

	/**
	 * 消息业务渠道
	 */
	@ApiField("msg_channel")
	private String msgChannel;

	/**
	 * 外部业务ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部消息id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 模板code
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 消息目标用户id
	 */
	@ApiField("to_open_id")
	private String toOpenId;

	/**
	 * 消息目标用户id
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

	public String getMsgChannel() {
		return this.msgChannel;
	}
	public void setMsgChannel(String msgChannel) {
		this.msgChannel = msgChannel;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
