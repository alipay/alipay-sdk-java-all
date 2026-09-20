package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福医生端消息推送接口
 *
 * @author auto create
 * @since 1.0, 2026-08-24 16:52:50
 */
public class AlipayCommerceMedicalDoctorMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 8543416197794267684L;

	/**
	 * 端用户id
	 */
	@ApiField("aq_user_id")
	private String aqUserId;

	/**
	 * aq_user_id
	 */
	@ApiField("aq_user_open_id")
	private String aqUserOpenId;

	/**
	 * 头像
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 最近的客户端消息ID
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 外部传入，随机生成
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 会话名称
	 */
	@ApiField("conversation_name")
	private String conversationName;

	/**
	 * 会话类型
	 */
	@ApiField("conversation_type")
	private String conversationType;

	/**
	 * 最近消息时间
	 */
	@ApiField("latest_msg_time")
	private String latestMsgTime;

	/**
	 * 跳转链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 最近的消息数据
	 */
	@ApiField("msg_data")
	private String msgData;

	/**
	 * 最近的消息ID
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 外部传入，需要发送的消息模版
	 */
	@ApiField("msg_template_code")
	private String msgTemplateCode;

	/**
	 * 最近的消息类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 外部传入，随机生成
	 */
	@ApiField("out_app_id")
	private String outAppId;

	/**
	 * 外部传入，随机生成
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 外部业务名称
	 */
	@ApiField("out_biz_name")
	private String outBizName;

	/**
	 * 接收者类型
	 */
	@ApiField("receiver_type")
	private String receiverType;

	/**
	 * 接收者，逗号分隔
	 */
	@ApiField("receivers")
	private String receivers;

	/**
	 * 外部传入，需要发送的消息类型
	 */
	@ApiField("send_types")
	private String sendTypes;

	/**
	 * 显示内容
	 */
	@ApiField("show_content")
	private String showContent;

	/**
	 * 外部传入，需要发送的消息内容
	 */
	@ApiField("template_params")
	private String templateParams;

	/**
	 * 剩余未读消息数
	 */
	@ApiField("un_read_count")
	private Long unReadCount;

	public String getAqUserId() {
		return this.aqUserId;
	}
	public void setAqUserId(String aqUserId) {
		this.aqUserId = aqUserId;
	}

	public String getAqUserOpenId() {
		return this.aqUserOpenId;
	}
	public void setAqUserOpenId(String aqUserOpenId) {
		this.aqUserOpenId = aqUserOpenId;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getClientMsgId() {
		return this.clientMsgId;
	}
	public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
	}

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getConversationName() {
		return this.conversationName;
	}
	public void setConversationName(String conversationName) {
		this.conversationName = conversationName;
	}

	public String getConversationType() {
		return this.conversationType;
	}
	public void setConversationType(String conversationType) {
		this.conversationType = conversationType;
	}

	public String getLatestMsgTime() {
		return this.latestMsgTime;
	}
	public void setLatestMsgTime(String latestMsgTime) {
		this.latestMsgTime = latestMsgTime;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getMsgData() {
		return this.msgData;
	}
	public void setMsgData(String msgData) {
		this.msgData = msgData;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgTemplateCode() {
		return this.msgTemplateCode;
	}
	public void setMsgTemplateCode(String msgTemplateCode) {
		this.msgTemplateCode = msgTemplateCode;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOutAppId() {
		return this.outAppId;
	}
	public void setOutAppId(String outAppId) {
		this.outAppId = outAppId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOutBizName() {
		return this.outBizName;
	}
	public void setOutBizName(String outBizName) {
		this.outBizName = outBizName;
	}

	public String getReceiverType() {
		return this.receiverType;
	}
	public void setReceiverType(String receiverType) {
		this.receiverType = receiverType;
	}

	public String getReceivers() {
		return this.receivers;
	}
	public void setReceivers(String receivers) {
		this.receivers = receivers;
	}

	public String getSendTypes() {
		return this.sendTypes;
	}
	public void setSendTypes(String sendTypes) {
		this.sendTypes = sendTypes;
	}

	public String getShowContent() {
		return this.showContent;
	}
	public void setShowContent(String showContent) {
		this.showContent = showContent;
	}

	public String getTemplateParams() {
		return this.templateParams;
	}
	public void setTemplateParams(String templateParams) {
		this.templateParams = templateParams;
	}

	public Long getUnReadCount() {
		return this.unReadCount;
	}
	public void setUnReadCount(Long unReadCount) {
		this.unReadCount = unReadCount;
	}

}
