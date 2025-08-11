package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-05 14:22:35
 */
public class EduClassTeacher extends AlipayObject {

	private static final long serialVersionUID = 2683153487939353238L;

	/**
	 * 上课老师Id
	 */
	@ApiField("teacher_id")
	private String teacherId;

	/**
	 * 上课老师名称
	 */
	@ApiField("teacher_name")
	private String teacherName;

	public String getTeacherId() {
		return this.teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return this.teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
