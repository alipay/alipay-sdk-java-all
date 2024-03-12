package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:26
 */
public class AlipayCommerceMedicalCardUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2785334538945675754L;

	/** 
	 * 医保电子凭证授权码
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/** 
	 * 授权码对应的医保电子凭证持卡人证件号
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/** 
	 * 授权码对应的医保电子凭证持卡人的证件类型
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/** 
	 * 授权码对应的医保电子凭证持卡人的姓名
	 */
	@ApiField("username")
	private String username;

	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}
	public String getMedicalCardId( ) {
		return this.medicalCardId;
	}

	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}
	public String getUserCertNo( ) {
		return this.userCertNo;
	}

	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}
	public String getUserCertType( ) {
		return this.userCertType;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername( ) {
		return this.username;
	}

}
