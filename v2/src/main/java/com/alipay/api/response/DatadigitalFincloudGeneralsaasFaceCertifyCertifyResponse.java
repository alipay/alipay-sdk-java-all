package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:55
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5746135149859319747L;

	/** 
	 * 调用IoT核验源接口返回的额外信息，包括一级和二级策略返回码
	 */
	@ApiField("extern_info")
	private String externInfo;

	/** 
	 * 核验不一致原因
	 */
	@ApiField("mismatch_reason")
	private String mismatchReason;

	/** 
	 * 是否通过，通过为T，不通过为F
	 */
	@ApiField("passed")
	private String passed;

	public void setExternInfo(String externInfo) {
		this.externInfo = externInfo;
	}
	public String getExternInfo( ) {
		return this.externInfo;
	}

	public void setMismatchReason(String mismatchReason) {
		this.mismatchReason = mismatchReason;
	}
	public String getMismatchReason( ) {
		return this.mismatchReason;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
