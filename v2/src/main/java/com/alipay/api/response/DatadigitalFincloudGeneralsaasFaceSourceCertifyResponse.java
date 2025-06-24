package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.source.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-07 14:37:03
 */
public class DatadigitalFincloudGeneralsaasFaceSourceCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6428667735535195184L;

	/** 
	 * 人脸认证单据号，用于认证问题排查
	 */
	@ApiField("certify_no")
	private String certifyNo;

	/** 
	 * 认证不通过原因
	 */
	@ApiField("mismatch_reason")
	private String mismatchReason;

	/** 
	 * T：通过；F：不通过
	 */
	@ApiField("passed")
	private String passed;

	/** 
	 * double值，人脸图片质量分
	 */
	@ApiField("quality")
	private String quality;

	/** 
	 * double值，活体检测结果分数
	 */
	@ApiField("score")
	private String score;

	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}
	public String getCertifyNo( ) {
		return this.certifyNo;
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

	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getQuality( ) {
		return this.quality;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

}
