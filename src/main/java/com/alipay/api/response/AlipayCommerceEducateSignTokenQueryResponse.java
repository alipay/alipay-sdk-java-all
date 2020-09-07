package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sign.token.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 20:00:01
 */
public class AlipayCommerceEducateSignTokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6357178868382364738L;

	/** 
	 * 业务场景类型标识
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 需要将该字段返回给学校
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型（"1","居民身份证"）
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 学校内标
	 */
	@ApiField("school_code")
	private String schoolCode;

	/** 
	 * 学校外标
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolCode( ) {
		return this.schoolCode;
	}

	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}
	public String getSchoolStdcode( ) {
		return this.schoolStdcode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
