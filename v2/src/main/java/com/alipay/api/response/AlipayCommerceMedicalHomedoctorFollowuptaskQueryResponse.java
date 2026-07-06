package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.followuptask.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-24 17:58:47
 */
public class AlipayCommerceMedicalHomedoctorFollowuptaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4421355636617516458L;

	/** 
	 * 外部业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 任务完成时间，仅当任务完成时才有值
	 */
	@ApiField("completed_time")
	private Date completedTime;

	/** 
	 * AES加密后的内容，指定服务商透出，仅当任务完成时才有值
	 */
	@ApiField("conversation_data_encrypted")
	private String conversationDataEncrypted;

	/** 
	 * 随访会话记录明文SHA256哈希值，仅当任务完成时才有值
	 */
	@ApiField("conversation_data_hash")
	private String conversationDataHash;

	/** 
	 * 加密密钥版本号，仅当任务完成时才有值
	 */
	@ApiField("encryption_key_version")
	private String encryptionKeyVersion;

	/** 
	 * AES加密后的内容，仅当任务完成时才有值
	 */
	@ApiField("form_data_encrypted")
	private String formDataEncrypted;

	/** 
	 * 随访表单内容明文SHA256哈希值，仅当任务完成时才有值
	 */
	@ApiField("form_data_hash")
	private String formDataHash;

	/** 
	 * 随访任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 随访任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	/** 
	 * AI随访模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * AI随访模版名称
	 */
	@ApiField("template_name")
	private String templateName;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setCompletedTime(Date completedTime) {
		this.completedTime = completedTime;
	}
	public Date getCompletedTime( ) {
		return this.completedTime;
	}

	public void setConversationDataEncrypted(String conversationDataEncrypted) {
		this.conversationDataEncrypted = conversationDataEncrypted;
	}
	public String getConversationDataEncrypted( ) {
		return this.conversationDataEncrypted;
	}

	public void setConversationDataHash(String conversationDataHash) {
		this.conversationDataHash = conversationDataHash;
	}
	public String getConversationDataHash( ) {
		return this.conversationDataHash;
	}

	public void setEncryptionKeyVersion(String encryptionKeyVersion) {
		this.encryptionKeyVersion = encryptionKeyVersion;
	}
	public String getEncryptionKeyVersion( ) {
		return this.encryptionKeyVersion;
	}

	public void setFormDataEncrypted(String formDataEncrypted) {
		this.formDataEncrypted = formDataEncrypted;
	}
	public String getFormDataEncrypted( ) {
		return this.formDataEncrypted;
	}

	public void setFormDataHash(String formDataHash) {
		this.formDataHash = formDataHash;
	}
	public String getFormDataHash( ) {
		return this.formDataHash;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName( ) {
		return this.templateName;
	}

}
