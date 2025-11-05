package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduCourseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.course.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:32:37
 */
public class AlipayCommerceEducateCourseInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5148813954998237323L;

	/** 
	 * 课程信息列表
	 */
	@ApiListField("course_list")
	@ApiField("edu_course_info")
	private List<EduCourseInfo> courseList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setCourseList(List<EduCourseInfo> courseList) {
		this.courseList = courseList;
	}
	public List<EduCourseInfo> getCourseList( ) {
		return this.courseList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
