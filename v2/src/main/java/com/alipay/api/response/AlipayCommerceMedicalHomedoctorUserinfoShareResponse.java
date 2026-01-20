package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.userinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-30 14:07:41
 */
public class AlipayCommerceMedicalHomedoctorUserinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 3299379298764473193L;

	/** 
	 * 蚂蚁健康用户对外开放OPEN_ID
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/** 
	 * 用户证件姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 人脸认证单据号
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 人脸认证状态：PROCESSING：初始化；SUCCESS：认证通过；FAIL：认证不通过
	 */
	@ApiField("certify_state")
	private String certifyState;

	/** 
	 * 用户手机号码
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}
	public String getAqOpenId( ) {
		return this.aqOpenId;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
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

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setCertifyState(String certifyState) {
		this.certifyState = certifyState;
	}
	public String getCertifyState( ) {
		return this.certifyState;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getMobilePhone( ) {
		return this.mobilePhone;
	}

}
