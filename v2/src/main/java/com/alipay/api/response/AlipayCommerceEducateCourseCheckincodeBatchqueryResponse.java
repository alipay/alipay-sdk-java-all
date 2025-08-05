package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduCourseCheckInRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.course.checkincode.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducateCourseCheckincodeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6434845519581685776L;

	/** 
	 * 课程签到码列表
	 */
	@ApiListField("check_in_code_list")
	@ApiField("edu_course_check_in_rule")
	private List<EduCourseCheckInRule> checkInCodeList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setCheckInCodeList(List<EduCourseCheckInRule> checkInCodeList) {
		this.checkInCodeList = checkInCodeList;
	}
	public List<EduCourseCheckInRule> getCheckInCodeList( ) {
		return this.checkInCodeList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
