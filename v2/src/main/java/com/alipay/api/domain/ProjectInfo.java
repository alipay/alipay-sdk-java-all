package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-10 10:47:52
 */
public class ProjectInfo extends AlipayObject {

	private static final long serialVersionUID = 4587478264596481496L;

	/**
	 * 权益终止时间，格式YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 履约权益编码
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 权益生效时间，格式yyyy-mm-dd hh:MM:ss
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
