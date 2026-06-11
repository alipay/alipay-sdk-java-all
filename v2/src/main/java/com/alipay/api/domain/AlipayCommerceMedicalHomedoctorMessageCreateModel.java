package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭医生宣教内容推送
 *
 * @author auto create
 * @since 1.0, 2026-06-01 16:42:01
 */
public class AlipayCommerceMedicalHomedoctorMessageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1264227185525638445L;

	/**
	 * 消息发送批次
	 */
	@ApiField("message_batch_no")
	private String messageBatchNo;

	/**
	 * [{"name":"宣教","value":"EDUCATION"},{"name":"体检通知","value":"HEALTH_CHECK"},{"name":"女性早筛","value":"FEMALE_EARLY_SCREENING"},{"name":"孕产妇通知","value":"PREGNANT_CARE"},{"name":"新生儿检查","value":"NEWBORN_CHECK"},{"name":"问卷","value":"QUESTIONNAIRE"}]
	 */
	@ApiField("message_biz_type")
	private String messageBizType;

	/**
	 * 消息内容
	 */
	@ApiField("message_content")
	private String messageContent;

	/**
	 * 消息链接概要文本
	 */
	@ApiField("message_content_digest")
	private String messageContentDigest;

	/**
	 * 消息链接缩略图素材链接
	 */
	@ApiField("message_content_icon")
	private String messageContentIcon;

	/**
	 * 消息独立图片的链接
	 */
	@ApiField("message_content_picture")
	private String messageContentPicture;

	/**
	 * 消息跳转链接
	 */
	@ApiField("message_content_url")
	private String messageContentUrl;

	/**
	 * 发送主体
	 */
	@ApiField("message_sender")
	private String messageSender;

	/**
	 * [{"name":"纯文本","value":"TXT"},{"name":"链接","value":"URL"},{"name":"独立图片","value":"PICTURE"}]
	 */
	@ApiField("message_template_type")
	private String messageTemplateType;

	/**
	 * 用户列表
	 */
	@ApiField("open_id_text")
	private String openIdText;

	public String getMessageBatchNo() {
		return this.messageBatchNo;
	}
	public void setMessageBatchNo(String messageBatchNo) {
		this.messageBatchNo = messageBatchNo;
	}

	public String getMessageBizType() {
		return this.messageBizType;
	}
	public void setMessageBizType(String messageBizType) {
		this.messageBizType = messageBizType;
	}

	public String getMessageContent() {
		return this.messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageContentDigest() {
		return this.messageContentDigest;
	}
	public void setMessageContentDigest(String messageContentDigest) {
		this.messageContentDigest = messageContentDigest;
	}

	public String getMessageContentIcon() {
		return this.messageContentIcon;
	}
	public void setMessageContentIcon(String messageContentIcon) {
		this.messageContentIcon = messageContentIcon;
	}

	public String getMessageContentPicture() {
		return this.messageContentPicture;
	}
	public void setMessageContentPicture(String messageContentPicture) {
		this.messageContentPicture = messageContentPicture;
	}

	public String getMessageContentUrl() {
		return this.messageContentUrl;
	}
	public void setMessageContentUrl(String messageContentUrl) {
		this.messageContentUrl = messageContentUrl;
	}

	public String getMessageSender() {
		return this.messageSender;
	}
	public void setMessageSender(String messageSender) {
		this.messageSender = messageSender;
	}

	public String getMessageTemplateType() {
		return this.messageTemplateType;
	}
	public void setMessageTemplateType(String messageTemplateType) {
		this.messageTemplateType = messageTemplateType;
	}

	public String getOpenIdText() {
		return this.openIdText;
	}
	public void setOpenIdText(String openIdText) {
		this.openIdText = openIdText;
	}

}
