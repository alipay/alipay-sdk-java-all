package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 导诊对话初始话内容结构
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class MedicalGuideChatInitDTO extends AlipayObject {

	private static final long serialVersionUID = 8465259519435549453L;

	/**
	 * 对话内容
	 */
	@ApiField("content")
	private MedicalGuideContentDTO content;

	/**
	 * 历史对话记录
	 */
	@ApiListField("dialog_history")
	@ApiField("medical_guide_dialog_d_t_o")
	private List<MedicalGuideDialogDTO> dialogHistory;

	/**
	 * 机器人logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 机器人昵称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public MedicalGuideContentDTO getContent() {
		return this.content;
	}
	public void setContent(MedicalGuideContentDTO content) {
		this.content = content;
	}

	public List<MedicalGuideDialogDTO> getDialogHistory() {
		return this.dialogHistory;
	}
	public void setDialogHistory(List<MedicalGuideDialogDTO> dialogHistory) {
		this.dialogHistory = dialogHistory;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
