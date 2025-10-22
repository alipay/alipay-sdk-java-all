package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询职业培训课程详情
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class AlipayEbppIndustryCareertrainingCourseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4768628472328981875L;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 是否查询编辑版本，false查询在线版本，true查询编辑版本。默认为false
	 */
	@ApiField("need_edit_version")
	private Boolean needEditVersion;

	/**
	 * 外部课程ID
	 */
	@ApiField("out_course_id")
	private String outCourseId;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Boolean getNeedEditVersion() {
		return this.needEditVersion;
	}
	public void setNeedEditVersion(Boolean needEditVersion) {
		this.needEditVersion = needEditVersion;
	}

	public String getOutCourseId() {
		return this.outCourseId;
	}
	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}

}
