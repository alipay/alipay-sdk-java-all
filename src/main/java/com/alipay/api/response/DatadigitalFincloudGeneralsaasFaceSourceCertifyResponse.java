package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.source.certify response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-15 17:51:40
 */
public class DatadigitalFincloudGeneralsaasFaceSourceCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7422578391781897711L;

	/** 
	 * 人脸认证单据号，调用后续OpenAPI（datadigital.fincloud.generalsaas.face.source.query
）时传入，用来查询结果
	 */
	@ApiField("certify_no")
	private String certifyNo;

	/** 
	 * T：通过；F：不通过
	 */
	@ApiField("passed")
	private String passed;

	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}
	public String getCertifyNo( ) {
		return this.certifyNo;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
