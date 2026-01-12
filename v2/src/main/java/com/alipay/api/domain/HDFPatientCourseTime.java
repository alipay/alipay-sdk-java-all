package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 患病时间信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFPatientCourseTime extends AlipayObject {

	private static final long serialVersionUID = 3362455188663174782L;

	/**
	 * 患病时间
	 */
	@ApiField("patient_course_time")
	private String patientCourseTime;

	public String getPatientCourseTime() {
		return this.patientCourseTime;
	}
	public void setPatientCourseTime(String patientCourseTime) {
		this.patientCourseTime = patientCourseTime;
	}

}
