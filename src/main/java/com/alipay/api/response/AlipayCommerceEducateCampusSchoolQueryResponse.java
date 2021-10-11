package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SchoolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.school.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-08 11:05:35
 */
public class AlipayCommerceEducateCampusSchoolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6284516166648381837L;

	/** 
	 * 学校信息列表
	 */
	@ApiListField("school_info")
	@ApiField("school_info")
	private List<SchoolInfo> schoolInfo;

	public void setSchoolInfo(List<SchoolInfo> schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	public List<SchoolInfo> getSchoolInfo( ) {
		return this.schoolInfo;
	}

}
