package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.verification.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-15 19:50:17
 */
public class AlipayUserCertifyVerificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7734156639417957518L;

	/** 
	 * 核验不一致原因
	 */
	@ApiField("mismatch_reason")
	private String mismatchReason;

	/** 
	 * 核验网络结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 核验源
	 */
	@ApiField("source_from")
	private String sourceFrom;

	public void setMismatchReason(String mismatchReason) {
		this.mismatchReason = mismatchReason;
	}
	public String getMismatchReason( ) {
		return this.mismatchReason;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getSourceFrom( ) {
		return this.sourceFrom;
	}

}
