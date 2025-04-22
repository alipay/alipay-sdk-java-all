package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心招工平台考勤信息同步
 *
 * @author auto create
 * @since 1.0, 2025-03-11 16:52:28
 */
public class AlipayEbppIndustryRecruitAttendanceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7432723357565993192L;

	/**
	 * 考勤打卡信息同步
考勤打卡状态变更
	 */
	@ApiField("attendance_type")
	private String attendanceType;

	/**
	 * 上班实际打卡时间
	 */
	@ApiField("clock_in_real_time")
	private Date clockInRealTime;

	/**
	 * Y-已打卡，N-未打卡；当状态为Y时，clock_in_real_time必填
	 */
	@ApiField("clock_in_status")
	private String clockInStatus;

	/**
	 * 上班待打卡时间
	 */
	@ApiField("clock_in_time")
	private Date clockInTime;

	/**
	 * 下班实际打卡时间
	 */
	@ApiField("clock_out_real_time")
	private Date clockOutRealTime;

	/**
	 * Y-已打卡，N-未打卡；当状态为Y时，clock_out_real_time必填
	 */
	@ApiField("clock_out_status")
	private String clockOutStatus;

	/**
	 * 下班待打卡时间
	 */
	@ApiField("clock_out_time")
	private Date clockOutTime;

	/**
	 * 服务商侧报名ID
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 外部考勤id
	 */
	@ApiField("out_attendance_id")
	private String outAttendanceId;

	/**
	 * 服务商侧岗位唯一标识
	 */
	@ApiField("out_job_id")
	private String outJobId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 考勤信息来源
	 */
	@ApiField("source")
	private String source;

	public String getAttendanceType() {
		return this.attendanceType;
	}
	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}

	public Date getClockInRealTime() {
		return this.clockInRealTime;
	}
	public void setClockInRealTime(Date clockInRealTime) {
		this.clockInRealTime = clockInRealTime;
	}

	public String getClockInStatus() {
		return this.clockInStatus;
	}
	public void setClockInStatus(String clockInStatus) {
		this.clockInStatus = clockInStatus;
	}

	public Date getClockInTime() {
		return this.clockInTime;
	}
	public void setClockInTime(Date clockInTime) {
		this.clockInTime = clockInTime;
	}

	public Date getClockOutRealTime() {
		return this.clockOutRealTime;
	}
	public void setClockOutRealTime(Date clockOutRealTime) {
		this.clockOutRealTime = clockOutRealTime;
	}

	public String getClockOutStatus() {
		return this.clockOutStatus;
	}
	public void setClockOutStatus(String clockOutStatus) {
		this.clockOutStatus = clockOutStatus;
	}

	public Date getClockOutTime() {
		return this.clockOutTime;
	}
	public void setClockOutTime(Date clockOutTime) {
		this.clockOutTime = clockOutTime;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getOutAttendanceId() {
		return this.outAttendanceId;
	}
	public void setOutAttendanceId(String outAttendanceId) {
		this.outAttendanceId = outAttendanceId;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
