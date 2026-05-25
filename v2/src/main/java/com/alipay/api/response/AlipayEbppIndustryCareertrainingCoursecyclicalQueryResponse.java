package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ClassInfoQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.coursecyclical.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-07 10:52:45
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2584499552629849826L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("class_info_query_v_o")
	private List<ClassInfoQueryVO> list;

	public void setList(List<ClassInfoQueryVO> list) {
		this.list = list;
	}
	public List<ClassInfoQueryVO> getList( ) {
		return this.list;
	}

}
