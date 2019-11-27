package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.certified.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-29 14:33:13
 */
public class AlipayCommerceEducateCertifiedInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8838396641966245322L;

	/** 
	 * 支付宝校园卡ID
	 */
	@ApiField("ali_card_id")
	private String aliCardId;

	/** 
	 * 认证机构
	 */
	@ApiField("auth_institute")
	private String authInstitute;

	/** 
	 * 认证类型
	 */
	@ApiField("auth_type")
	private String authType;

	/** 
	 * 一卡通物理卡卡号
	 */
	@ApiField("physical_card_number")
	private String physicalCardNumber;

	/** 
	 * 学生所在学校姓名
	 */
	@ApiField("school_name")
	private String schoolName;

	public void setAliCardId(String aliCardId) {
		this.aliCardId = aliCardId;
	}
	public String getAliCardId( ) {
		return this.aliCardId;
	}

	public void setAuthInstitute(String authInstitute) {
		this.authInstitute = authInstitute;
	}
	public String getAuthInstitute( ) {
		return this.authInstitute;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getAuthType( ) {
		return this.authType;
	}

	public void setPhysicalCardNumber(String physicalCardNumber) {
		this.physicalCardNumber = physicalCardNumber;
	}
	public String getPhysicalCardNumber( ) {
		return this.physicalCardNumber;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName( ) {
		return this.schoolName;
	}

}
