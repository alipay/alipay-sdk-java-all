package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建视频会议
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:09
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6425318756729621449L;

	/**
	 * 患者ID
	 */
	@ApiField("patient_id")
	private Long patientId;

	/**
	 * 时间格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("scheduled_end_time")
	private Date scheduledEndTime;

	/**
	 * 时间格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("scheduled_start_time")
	private Date scheduledStartTime;

	/**
	 * 好大夫侧获取外部来源ID，如执行单ID
	 */
	@ApiField("source_id")
	private Long sourceId;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 从好大夫侧获取医生空间
	 */
	@ApiField("space_id")
	private Long spaceId;

	/**
	 * 好大夫侧用户ID
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getPatientId() {
		return this.patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Date getScheduledEndTime() {
		return this.scheduledEndTime;
	}
	public void setScheduledEndTime(Date scheduledEndTime) {
		this.scheduledEndTime = scheduledEndTime;
	}

	public Date getScheduledStartTime() {
		return this.scheduledStartTime;
	}
	public void setScheduledStartTime(Date scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
	}

	public Long getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Long getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(Long spaceId) {
		this.spaceId = spaceId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
