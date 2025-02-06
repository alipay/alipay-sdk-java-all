package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通话录音详情
 *
 * @author auto create
 * @since 1.0, 2023-12-07 14:30:49
 */
public class Recording extends AlipayObject {

	private static final long serialVersionUID = 3244542327594669264L;

	/**
	 * 坐席ID。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 坐席名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 通话id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 录音时长，单位毫秒。
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 录音文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 录音文件的OSS下载地址，注意下载地址的过期时间，下载地址的有效期为1天。
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 录音开始时间，格式为Unix时间戳，单位毫秒。
	 */
	@ApiField("start_time")
	private Long startTime;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
