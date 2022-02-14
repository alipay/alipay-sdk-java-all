package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SchoolSimpleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.institutions.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-14 15:11:36
 */
public class AlipayCommerceEducateCampusInstitutionsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5115256286137864571L;

	/** 
	 * 学校简单信息列表
	 */
	@ApiField("school_info")
	private SchoolSimpleInfo schoolInfo;

	public void setSchoolInfo(SchoolSimpleInfo schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	public SchoolSimpleInfo getSchoolInfo( ) {
		return this.schoolInfo;
	}

}
