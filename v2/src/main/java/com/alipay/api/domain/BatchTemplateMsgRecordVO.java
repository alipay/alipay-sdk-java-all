package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板批量发送记录VO模型
 *
 * @author auto create
 * @since 1.0, 2024-01-14 22:42:48
 */
public class BatchTemplateMsgRecordVO extends AlipayObject {

	private static final long serialVersionUID = 8842486549439279348L;

	/**
	 * 批量发送记录ID，唯一标识一次消息模板批量查询
	 */
	@ApiField("batch_msg_id")
	private String batchMsgId;

	/**
	 * 批量发送指定的棋盘人群编码，用于定向人群消息投送。获取棋盘人群编码可参考<a href="https://opendocs.alipay.com/b/05pafz?pathHash=391f9fa7" target="_blank">棋盘密云接入文档</a>
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 消息卡片内容，包括消息模板标题、消息关键词信息以及消息跳链
	 */
	@ApiField("msg_content")
	private MsgTemplateContentVO msgContent;

	/**
	 * 消息发送量
	 */
	@ApiField("msg_send_count")
	private Long msgSendCount;

	/**
	 * 批量发送状态
	 */
	@ApiField("msg_send_status")
	private String msgSendStatus;

	/**
	 * 消息实际发送时间，若商户在调用消息发送接口时指定了定时时间，则该值为商户设定的定时发送时间
	 */
	@ApiField("msg_send_time")
	private Date msgSendTime;

	/**
	 * 商家在商家自运营中心选用的消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBatchMsgId() {
		return this.batchMsgId;
	}
	public void setBatchMsgId(String batchMsgId) {
		this.batchMsgId = batchMsgId;
	}

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public MsgTemplateContentVO getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(MsgTemplateContentVO msgContent) {
		this.msgContent = msgContent;
	}

	public Long getMsgSendCount() {
		return this.msgSendCount;
	}
	public void setMsgSendCount(Long msgSendCount) {
		this.msgSendCount = msgSendCount;
	}

	public String getMsgSendStatus() {
		return this.msgSendStatus;
	}
	public void setMsgSendStatus(String msgSendStatus) {
		this.msgSendStatus = msgSendStatus;
	}

	public Date getMsgSendTime() {
		return this.msgSendTime;
	}
	public void setMsgSendTime(Date msgSendTime) {
		this.msgSendTime = msgSendTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
