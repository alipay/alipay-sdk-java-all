package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.student.simple.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseStudentSimpleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6756737935219589781L;

	/** 
	 * 大学编码
	 */
	@ApiField("campus_code")
	private String campusCode;

	/** 
	 * 大学名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setCampusCode(String campusCode) {
		this.campusCode = campusCode;
	}
	public String getCampusCode( ) {
		return this.campusCode;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}
	public String getCampusName( ) {
		return this.campusName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
