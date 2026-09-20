package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧发布结果信息
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:59:01
 */
public class ShortPlayChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 3332565585278865185L;

	/**
	 * CCID，该渠道的短剧标识
	 */
	@ApiField("cc_id")
	private String ccId;

	/**
	 * 渠道：0 商家小程序；1 生活号；2 官方小程序
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 生活号
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 发起时间，秒级时间戳
	 */
	@ApiField("request_time")
	private Long requestTime;

	/**
	 * 发布任务ID
	 */
	@ApiField("review_id")
	private String reviewId;

	/**
	 * 发布结果：0 发布成功；1 发布失败；2 审核中；
	 */
	@ApiField("review_result")
	private String reviewResult;

	/**
	 * 审核建议（版审建议 + 剧安审建议）
	 */
	@ApiField("review_suggest")
	private String reviewSuggest;

	/**
	 * 状态
0：审核中
1：审核失败
2：已发布
4：平台处置下架
5：用户下架
	 */
	@ApiField("status")
	private String status;

	public String getCcId() {
		return this.ccId;
	}
	public void setCcId(String ccId) {
		this.ccId = ccId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public Long getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Long requestTime) {
		this.requestTime = requestTime;
	}

	public String getReviewId() {
		return this.reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewResult() {
		return this.reviewResult;
	}
	public void setReviewResult(String reviewResult) {
		this.reviewResult = reviewResult;
	}

	public String getReviewSuggest() {
		return this.reviewSuggest;
	}
	public void setReviewSuggest(String reviewSuggest) {
		this.reviewSuggest = reviewSuggest;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
