package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 法链系统 签约文件申请电子印章
 *
 * @author auto create
 * @since 1.0, 2020-11-04 15:22:25
 */
public class AlipayBossProdAntlegalchainEcsealApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7783322825825794969L;

	/**
	 * 发起签约接口返回的baseDataId
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	/**
	 * 业务数据请求唯一标识，需要保证唯一性
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 合同名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 用于标识某个文件
	 */
	@ApiField("file_uniq_id")
	private String fileUniqId;

	/**
	 * 通知人邮箱地址列表
	 */
	@ApiListField("notify_emails")
	@ApiField("string")
	private List<String> notifyEmails;

	/**
	 * 请求来源系统英文名称
	 */
	@ApiField("request_app_name")
	private String requestAppName;

	/**
	 * 请求时间戳（请求时间的毫秒值）
	 */
	@ApiField("request_time_stamp")
	private String requestTimeStamp;

	/**
	 * 请求token
	 */
	@ApiField("request_token")
	private String requestToken;

	/**
	 * 任务owner通知邮箱
	 */
	@ApiField("task_owner_email")
	private String taskOwnerEmail;

	/**
	 * 任务owner姓名
	 */
	@ApiField("task_owner_name")
	private String taskOwnerName;

	/**
	 * 任务owner工号
	 */
	@ApiField("task_owner_no")
	private String taskOwnerNo;

	public String getBasDataId() {
		return this.basDataId;
	}
	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUniqId() {
		return this.fileUniqId;
	}
	public void setFileUniqId(String fileUniqId) {
		this.fileUniqId = fileUniqId;
	}

	public List<String> getNotifyEmails() {
		return this.notifyEmails;
	}
	public void setNotifyEmails(List<String> notifyEmails) {
		this.notifyEmails = notifyEmails;
	}

	public String getRequestAppName() {
		return this.requestAppName;
	}
	public void setRequestAppName(String requestAppName) {
		this.requestAppName = requestAppName;
	}

	public String getRequestTimeStamp() {
		return this.requestTimeStamp;
	}
	public void setRequestTimeStamp(String requestTimeStamp) {
		this.requestTimeStamp = requestTimeStamp;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getTaskOwnerEmail() {
		return this.taskOwnerEmail;
	}
	public void setTaskOwnerEmail(String taskOwnerEmail) {
		this.taskOwnerEmail = taskOwnerEmail;
	}

	public String getTaskOwnerName() {
		return this.taskOwnerName;
	}
	public void setTaskOwnerName(String taskOwnerName) {
		this.taskOwnerName = taskOwnerName;
	}

	public String getTaskOwnerNo() {
		return this.taskOwnerNo;
	}
	public void setTaskOwnerNo(String taskOwnerNo) {
		this.taskOwnerNo = taskOwnerNo;
	}

}
