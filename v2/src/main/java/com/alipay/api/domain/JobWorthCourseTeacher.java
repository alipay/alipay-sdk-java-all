package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教师信息
 *
 * @author auto create
 * @since 1.0, 2023-03-27 16:36:49
 */
public class JobWorthCourseTeacher extends AlipayObject {

	private static final long serialVersionUID = 1192137117366349214L;

	/**
	 * 教师描述信息，由商户自行设置，配置的文案将会在课程详情页透出
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * id类型，ID_CARD代表身份证
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 教师id,全局唯一
	 */
	@ApiField("teacher_id")
	private String teacherId;

	/**
	 * 教师名称
	 */
	@ApiField("teacher_name")
	private String teacherName;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

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
