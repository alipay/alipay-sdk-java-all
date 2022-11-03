package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计数信息
 *
 * @author auto create
 * @since 1.0, 2017-11-29 17:17:03
 */
public class CountInfo extends AlipayObject {

	private static final long serialVersionUID = 5572752433931911831L;

	/**
	 * 飞猪内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 点赞数
	 */
	@ApiField("support_count")
	private Long supportCount;

	/**
	 * 阅读数
	 */
	@ApiField("total_page_view_count")
	private Long totalPageViewCount;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Long getSupportCount() {
		return this.supportCount;
	}
	public void setSupportCount(Long supportCount) {
		this.supportCount = supportCount;
	}

	public Long getTotalPageViewCount() {
		return this.totalPageViewCount;
	}
	public void setTotalPageViewCount(Long totalPageViewCount) {
		this.totalPageViewCount = totalPageViewCount;
	}

}
