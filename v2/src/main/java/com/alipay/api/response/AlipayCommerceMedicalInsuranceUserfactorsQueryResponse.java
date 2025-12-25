package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.userfactors.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 10:57:28
 */
public class AlipayCommerceMedicalInsuranceUserfactorsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2659615111375943566L;

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
