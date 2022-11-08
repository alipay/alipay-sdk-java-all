package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SchoolSimpleInfo;
import com.alipay.api.domain.SchoolBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.institutions.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-27 11:27:15
 */
public class AlipayCommerceEducateCampusInstitutionsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3158467345345713724L;

	/** 
	 * 学校简单信息列表
	 */
	@ApiField("school_info")
	private SchoolSimpleInfo schoolInfo;

	/** 
	 * 学校基础信息列表
	 */
	@ApiListField("school_info_list")
	@ApiField("school_base_info")
	private List<SchoolBaseInfo> schoolInfoList;

	public void setSchoolInfo(SchoolSimpleInfo schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	public SchoolSimpleInfo getSchoolInfo( ) {
		return this.schoolInfo;
	}

	public void setSchoolInfoList(List<SchoolBaseInfo> schoolInfoList) {
		this.schoolInfoList = schoolInfoList;
	}
	public List<SchoolBaseInfo> getSchoolInfoList( ) {
		return this.schoolInfoList;
	}

}
