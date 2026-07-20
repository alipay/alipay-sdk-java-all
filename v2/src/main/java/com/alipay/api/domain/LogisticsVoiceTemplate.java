package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:30
 */
public class LogisticsVoiceTemplate extends AlipayObject {

	private static final long serialVersionUID = 3875157383893238638L;

	/**
	 * 过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 只有ONLINE为可用状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 语音内容URL
	 */
	@ApiField("voice_content_url")
	private String voiceContentUrl;

	/**
	 * 语音模板ID
	 */
	@ApiField("voice_template_id")
	private String voiceTemplateId;

	/**
	 * 语音模板名称
	 */
	@ApiField("voice_template_name")
	private String voiceTemplateName;

	/**
	 * 语音文本
	 */
	@ApiField("voice_text")
	private String voiceText;

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoiceContentUrl() {
		return this.voiceContentUrl;
	}
	public void setVoiceContentUrl(String voiceContentUrl) {
		this.voiceContentUrl = voiceContentUrl;
	}

	public String getVoiceTemplateId() {
		return this.voiceTemplateId;
	}
	public void setVoiceTemplateId(String voiceTemplateId) {
		this.voiceTemplateId = voiceTemplateId;
	}

	public String getVoiceTemplateName() {
		return this.voiceTemplateName;
	}
	public void setVoiceTemplateName(String voiceTemplateName) {
		this.voiceTemplateName = voiceTemplateName;
	}

	public String getVoiceText() {
		return this.voiceText;
	}
	public void setVoiceText(String voiceText) {
		this.voiceText = voiceText;
	}

}
