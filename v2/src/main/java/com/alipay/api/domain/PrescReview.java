package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方审核记录
 *
 * @author auto create
 * @since 1.0, 2025-06-10 19:20:18
 */
public class PrescReview extends AlipayObject {

	private static final long serialVersionUID = 4742362292993786224L;

	/**
	 * 商家审方药师姓名
	 */
	@ApiField("pharmacist_name")
	private String pharmacistName;

	/**
	 * 审核驳回原因
	 */
	@ApiField("review_reject_note")
	private String reviewRejectNote;

	/**
	 * 审核状态
1-待审核 2-通过 3-驳回 4-超时
	 */
	@ApiField("review_status")
	private String reviewStatus;

	/**
	 * 药师审核时间
	 */
	@ApiField("review_time")
	private Date reviewTime;

	public String getPharmacistName() {
		return this.pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}

	public String getReviewRejectNote() {
		return this.reviewRejectNote;
	}
	public void setReviewRejectNote(String reviewRejectNote) {
		this.reviewRejectNote = reviewRejectNote;
	}

	public String getReviewStatus() {
		return this.reviewStatus;
	}
	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public Date getReviewTime() {
		return this.reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

}
