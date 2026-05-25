package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CourseQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.newcourse.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-07 10:57:45
 */
public class AlipayEbppIndustryCareertrainingNewcourseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6523175395368838663L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("course_query_v_o")
	private List<CourseQueryVO> list;

	/** 
	 * 总数量（个）
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<CourseQueryVO> list) {
		this.list = list;
	}
	public List<CourseQueryVO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
