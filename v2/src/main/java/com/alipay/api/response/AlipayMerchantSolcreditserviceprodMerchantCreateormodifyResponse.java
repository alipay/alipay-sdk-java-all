package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.merchant.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 20:02:21
 */
public class AlipayMerchantSolcreditserviceprodMerchantCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4477948455328662891L;

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
