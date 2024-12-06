package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身构造体
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:59:56
 */
public class FaceCheckInitResult extends AlipayObject {

	private static final long serialVersionUID = 5443424567665575753L;

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

	public String getVerifyBizNo() {
		return this.verifyBizNo;
	}
	public void setVerifyBizNo(String verifyBizNo) {
		this.verifyBizNo = verifyBizNo;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

	public String getVerifyUrl() {
		return this.verifyUrl;
	}
	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}

}
