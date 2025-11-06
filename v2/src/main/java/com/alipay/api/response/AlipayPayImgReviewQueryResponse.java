package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.img.review.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 17:27:33
 */
public class AlipayPayImgReviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7668631127396129722L;

	/** 
	 * 图片审核状态结果，
REVIEWING为审核中，REVIEW_SUCCESS为审核成功，REVIEW_FAIL为审核失败，WAIT_REVIEW
	 */
	@ApiField("review_status")
	private String reviewStatus;

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public String getReviewStatus( ) {
		return this.reviewStatus;
	}

}
