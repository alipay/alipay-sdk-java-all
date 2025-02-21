package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.userfactors.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-21 21:27:17
 */
public class AlipayCommerceMedicalInsuranceUserfactorsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3261341279537759314L;

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

}
