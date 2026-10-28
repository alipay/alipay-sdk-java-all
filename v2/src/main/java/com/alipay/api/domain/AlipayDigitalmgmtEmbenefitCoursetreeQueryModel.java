package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询课程下视频资源
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:44:37
 */
public class AlipayDigitalmgmtEmbenefitCoursetreeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4748544784193147272L;

	/**
	 * 课程 id（精确匹配，二选一，优先）通过线下数据提供给用户
	 */
	@ApiField("course_id")
	private Long courseId;

	/**
	 * 课程名（精确匹配，二选一；同名课程返回列表）
	 */
	@ApiField("course_name")
	private String courseName;

	public Long getCourseId() {
		return this.courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
