package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.userfactors.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 18:27:48
 */
public class AlipayCommerceMedicalInsuranceUserfactorsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3294143185433199823L;

	/** 
	 * 证件号，例如：身份证证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 用户在中国大陆使用的标识个人身份的证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 用户真实姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户Id
	 */
	@ApiField("user_id")
	private String userId;

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

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
