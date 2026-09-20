package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧发布渠道信息
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:58:03
 */
public class ShortPlayPublishChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 1184547128524285299L;

	/**
	 * CCID，该渠道的短剧标识
	 */
	@ApiField("cc_id")
	private String ccId;

	/**
	 * 渠道。0 商家小程序；1 生活号。
	 */
	@ApiField("channel")
	private Long channel;

	/**
	 * 统一审核任务ID
	 */
	@ApiField("review_id")
	private String reviewId;

	/**
	 * 发布状态
	 */
	@ApiField("status")
	private String status;

	public String getCcId() {
		return this.ccId;
	}
	public void setCcId(String ccId) {
		this.ccId = ccId;
	}

	public Long getChannel() {
		return this.channel;
	}
	public void setChannel(Long channel) {
		this.channel = channel;
	}

	public String getReviewId() {
		return this.reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
