package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.face.check.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 16:32:25
 */
public class AlipayCloudCloudpromoFaceCheckCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6231581419981127856L;

	/** 
	 * 校验单据号
	 */
	@ApiField("verify_biz_no")
	private String verifyBizNo;

	/** 
	 * 校验id
	 */
	@ApiField("verify_id")
	private String verifyId;

	/** 
	 * 校验url
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	public void setVerifyBizNo(String verifyBizNo) {
		this.verifyBizNo = verifyBizNo;
	}
	public String getVerifyBizNo( ) {
		return this.verifyBizNo;
	}

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
