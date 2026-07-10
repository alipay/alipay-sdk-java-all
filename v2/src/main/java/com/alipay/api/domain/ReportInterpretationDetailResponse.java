package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告解读结果
 *
 * @author auto create
 * @since 1.0, 2026-06-08 17:57:56
 */
public class ReportInterpretationDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 7139826686744221264L;

	/**
	 * 聊天ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 文件来源
	 */
	@ApiField("file_source")
	private String fileSource;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 主键ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 解读结果
	 */
	@ApiField("interpretation_result")
	private String interpretationResult;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户来源
	 */
	@ApiField("user_type")
	private String userType;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getFileSource() {
		return this.fileSource;
	}
	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInterpretationResult() {
		return this.interpretationResult;
	}
	public void setInterpretationResult(String interpretationResult) {
		this.interpretationResult = interpretationResult;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
