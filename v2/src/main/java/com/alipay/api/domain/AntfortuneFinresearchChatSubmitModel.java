package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支小助提交问题
 *
 * @author auto create
 * @since 1.0, 2024-06-21 16:38:16
 */
public class AntfortuneFinresearchChatSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6333919432769898827L;

	/**
	 * 合作方内部的唯一标识
	 */
	@ApiField("bu_unique_id")
	private String buUniqueId;

	/**
	 * 业务类型，如果是就业问答请传入college_work
其他的情况可以不传或者传空字符串
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 文件id，目前仅支持单个，如果传多个会默认使用第一个， 如果filetype传了file，并且指定了file_id ，则会根据文件内容来回答问题
	 */
	@ApiListField("file_ids")
	@ApiField("string")
	private List<String> fileIds;

	/**
	 * 文件类型。开放出来的支持 文件解读(目前仅支持单个pdf),网页（单个）
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * RAG 快速解读，PEER 4e模式
不传默认使用PEER，
	 */
	@ApiField("interpret_mode")
	private String interpretMode;

	/**
	 * 用户所要提问的问题
	 */
	@ApiField("question")
	private String question;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 小助分配给用户的租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 需要解析的网页列表，如果file_type等于url，并且这个字段传了网址，则会根据网站的内容来回答内容，目前仅支持单个，如果传多个会默认使用第一个
	 */
	@ApiListField("urls")
	@ApiField("string")
	private List<String> urls;

	/**
	 * 从预设专家框架中选择想要指定的框架
	 */
	@ApiField("user_framework_code")
	private String userFrameworkCode;

	public String getBuUniqueId() {
		return this.buUniqueId;
	}
	public void setBuUniqueId(String buUniqueId) {
		this.buUniqueId = buUniqueId;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public List<String> getFileIds() {
		return this.fileIds;
	}
	public void setFileIds(List<String> fileIds) {
		this.fileIds = fileIds;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getInterpretMode() {
		return this.interpretMode;
	}
	public void setInterpretMode(String interpretMode) {
		this.interpretMode = interpretMode;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public List<String> getUrls() {
		return this.urls;
	}
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public String getUserFrameworkCode() {
		return this.userFrameworkCode;
	}
	public void setUserFrameworkCode(String userFrameworkCode) {
		this.userFrameworkCode = userFrameworkCode;
	}

}
