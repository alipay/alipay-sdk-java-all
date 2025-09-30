package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduSemesterInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.semester.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducateSemesterInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2793567951463419518L;

	/** 
	 * 学期信息列表
	 */
	@ApiListField("semester_list")
	@ApiField("edu_semester_info")
	private List<EduSemesterInfo> semesterList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setSemesterList(List<EduSemesterInfo> semesterList) {
		this.semesterList = semesterList;
	}
	public List<EduSemesterInfo> getSemesterList( ) {
		return this.semesterList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
