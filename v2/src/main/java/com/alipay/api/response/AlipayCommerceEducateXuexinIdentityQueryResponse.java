package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.xuexin.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:26
 */
public class AlipayCommerceEducateXuexinIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1774235192693265666L;

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

	/** 
	 * 学信网返回不是学生原因，仅6要素校验提供。
"LEVEL_NO_MATCH", "教育层次校验失败"
"SCHOOL_NO_MATCH", "学校校验失败"
"ENROLL_DATE_NO_MATCH", "入学日期校验失败"
"DEGREE_NO_MATCH", "学历校验失败"
"IDENTITY_CARD_NO_MATCH", "证件类型不是身份证"
	 */
	@ApiField("reason_code")
	private String reasonCode;

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

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonCode( ) {
		return this.reasonCode;
	}

}
