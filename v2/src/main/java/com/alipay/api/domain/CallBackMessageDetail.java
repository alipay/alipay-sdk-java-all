package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外呼回执信息明细
 *
 * @author auto create
 * @since 1.0, 2024-11-13 11:38:37
 */
public class CallBackMessageDetail extends AlipayObject {

	private static final long serialVersionUID = 3482799469247473475L;

	/**
	 * 用户开始接听时间，是一个时间点
	 */
	@ApiField("answer_time")
	private Date answerTime;

	/**
	 * 批次ID，业务幂等使用
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 呼叫开始时间
	 */
	@ApiField("call_begin_time")
	private Date callBeginTime;

	/**
	 * 呼叫id
	 */
	@ApiField("call_id")
	private String callId;

	/**
	 * 通话录音地址
	 */
	@ApiField("chat_record")
	private String chatRecord;

	/**
	 * 语音记录
	 */
	@ApiField("chats")
	private String chats;

	/**
	 * 挂断时间
	 */
	@ApiField("hangup_time")
	private Date hangupTime;

	/**
	 * 导入时间
	 */
	@ApiField("import_time")
	private Date importTime;

	/**
	 * 个人标签
	 */
	@ApiField("individual_tag")
	private String individualTag;

	/**
	 * 意向描述
	 */
	@ApiField("intent_description")
	private String intentDescription;

	/**
	 * 意向标签
	 */
	@ApiField("intent_tag")
	private String intentTag;

	/**
	 * 回复关键字
	 */
	@ApiField("keywords")
	private String keywords;

	/**
	 * 震铃时长（单位毫秒）
	 */
	@ApiField("ring_time")
	private String ringTime;

	/**
	 * 通话时长(单位秒)
	 */
	@ApiField("speaking_duration")
	private String speakingDuration;

	/**
	 * 通话轮数(单位轮)
	 */
	@ApiField("speaking_turns")
	private String speakingTurns;

	/**
	 * 外呼状态编码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 状态描述
	 */
	@ApiField("status_description")
	private String statusDescription;

	/**
	 * 外呼任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 外呼的话术模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public Date getAnswerTime() {
		return this.answerTime;
	}
	public void setAnswerTime(Date answerTime) {
		this.answerTime = answerTime;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public Date getCallBeginTime() {
		return this.callBeginTime;
	}
	public void setCallBeginTime(Date callBeginTime) {
		this.callBeginTime = callBeginTime;
	}

	public String getCallId() {
		return this.callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getChatRecord() {
		return this.chatRecord;
	}
	public void setChatRecord(String chatRecord) {
		this.chatRecord = chatRecord;
	}

	public String getChats() {
		return this.chats;
	}
	public void setChats(String chats) {
		this.chats = chats;
	}

	public Date getHangupTime() {
		return this.hangupTime;
	}
	public void setHangupTime(Date hangupTime) {
		this.hangupTime = hangupTime;
	}

	public Date getImportTime() {
		return this.importTime;
	}
	public void setImportTime(Date importTime) {
		this.importTime = importTime;
	}

	public String getIndividualTag() {
		return this.individualTag;
	}
	public void setIndividualTag(String individualTag) {
		this.individualTag = individualTag;
	}

	public String getIntentDescription() {
		return this.intentDescription;
	}
	public void setIntentDescription(String intentDescription) {
		this.intentDescription = intentDescription;
	}

	public String getIntentTag() {
		return this.intentTag;
	}
	public void setIntentTag(String intentTag) {
		this.intentTag = intentTag;
	}

	public String getKeywords() {
		return this.keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getRingTime() {
		return this.ringTime;
	}
	public void setRingTime(String ringTime) {
		this.ringTime = ringTime;
	}

	public String getSpeakingDuration() {
		return this.speakingDuration;
	}
	public void setSpeakingDuration(String speakingDuration) {
		this.speakingDuration = speakingDuration;
	}

	public String getSpeakingTurns() {
		return this.speakingTurns;
	}
	public void setSpeakingTurns(String speakingTurns) {
		this.speakingTurns = speakingTurns;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
