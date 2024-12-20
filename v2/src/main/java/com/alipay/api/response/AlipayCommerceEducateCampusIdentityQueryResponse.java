package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 14:50:43
 */
public class AlipayCommerceEducateCampusIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2616997898535487494L;

	/** 
	 * 查询用户是否目前是大学生
	 */
	@ApiField("college_online_tag")
	private String collegeOnlineTag;

	public void setCollegeOnlineTag(String collegeOnlineTag) {
		this.collegeOnlineTag = collegeOnlineTag;
	}
	public String getCollegeOnlineTag( ) {
		return this.collegeOnlineTag;
	}

}
