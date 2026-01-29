package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CourseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-14 10:57:43
 */
public class AlipayEbppIndustryCareertrainingCourseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5429949529738897253L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("course_v_o")
	private List<CourseVO> list;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 最大50
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 课程总个数
	 */
	@ApiField("total")
	private String total;

	public void setList(List<CourseVO> list) {
		this.list = list;
	}
	public List<CourseVO> getList( ) {
		return this.list;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
