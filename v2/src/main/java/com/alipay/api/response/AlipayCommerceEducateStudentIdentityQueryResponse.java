package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.student.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:02:23
 */
public class AlipayCommerceEducateStudentIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8372694493525714346L;

	/** 
	 * 查询用户所在大学，查询商户需要商务层面申请此字段，且支付宝模型中存在此字段才能返回。
	 */
	@ApiField("college_name")
	private String collegeName;

	/** 
	 * 查询用户是否目前是大学生
	 */
	@ApiField("college_online_tag")
	private String collegeOnlineTag;

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeName( ) {
		return this.collegeName;
	}

	public void setCollegeOnlineTag(String collegeOnlineTag) {
		this.collegeOnlineTag = collegeOnlineTag;
	}
	public String getCollegeOnlineTag( ) {
		return this.collegeOnlineTag;
	}

}
