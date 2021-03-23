package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.xuexin.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-05 13:55:15
 */
public class AlipayCommerceEducateXuexinIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2315238426859682173L;

	/** 
	 * 0表示非学生,1表示学生
	 */
	@ApiField("college_online_tag")
	private String collegeOnlineTag;

	/** 
	 * 预计毕业时间 yyyyMM
	 */
	@ApiField("graduate_time")
	private String graduateTime;

	public void setCollegeOnlineTag(String collegeOnlineTag) {
		this.collegeOnlineTag = collegeOnlineTag;
	}
	public String getCollegeOnlineTag( ) {
		return this.collegeOnlineTag;
	}

	public void setGraduateTime(String graduateTime) {
		this.graduateTime = graduateTime;
	}
	public String getGraduateTime( ) {
		return this.graduateTime;
	}

}
