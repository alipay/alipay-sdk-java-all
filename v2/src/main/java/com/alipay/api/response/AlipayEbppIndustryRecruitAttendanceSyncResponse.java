package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.recruit.attendance.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-11 16:52:28
 */
public class AlipayEbppIndustryRecruitAttendanceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7372223784526967113L;

	/** 
	 * 支付考勤id
	 */
	@ApiField("attendance_id")
	private String attendanceId;

	public void setAttendanceId(String attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getAttendanceId( ) {
		return this.attendanceId;
	}

}
