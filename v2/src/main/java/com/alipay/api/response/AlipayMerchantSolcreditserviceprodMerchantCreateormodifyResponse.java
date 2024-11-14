package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.merchant.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 09:12:13
 */
public class AlipayMerchantSolcreditserviceprodMerchantCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6821574598423586731L;

	/** 
	 * 为空则表示本次修改不需要审核
	 */
	@ApiField("review_version_no")
	private String reviewVersionNo;

	/** 
	 * 为空则表示暂无审核通过版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setReviewVersionNo(String reviewVersionNo) {
		this.reviewVersionNo = reviewVersionNo;
	}
	public String getReviewVersionNo( ) {
		return this.reviewVersionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
