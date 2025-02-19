package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.recruit.attendance.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-17 16:17:23
 */
public class AlipayEbppIndustryRecruitAttendanceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3486231342564512419L;

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
