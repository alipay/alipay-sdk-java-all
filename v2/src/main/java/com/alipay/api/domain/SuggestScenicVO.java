package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class SuggestScenicVO extends AlipayObject {

	private static final long serialVersionUID = 6638397444882393827L;

	/**
	 * 观景图
	 */
	@ApiField("suggest_pic_url")
	private String suggestPicUrl;

	/**
	 * 评分
	 */
	@ApiField("suggest_rating")
	private String suggestRating;

	/**
	 * 建议时间
	 */
	@ApiField("suggest_time")
	private String suggestTime;

	/**
	 * 标题
	 */
	@ApiField("suggest_title")
	private String suggestTitle;

	public String getSuggestPicUrl() {
		return this.suggestPicUrl;
	}
	public void setSuggestPicUrl(String suggestPicUrl) {
		this.suggestPicUrl = suggestPicUrl;
	}

	public String getSuggestRating() {
		return this.suggestRating;
	}
	public void setSuggestRating(String suggestRating) {
		this.suggestRating = suggestRating;
	}

	public String getSuggestTime() {
		return this.suggestTime;
	}
	public void setSuggestTime(String suggestTime) {
		this.suggestTime = suggestTime;
	}

	public String getSuggestTitle() {
		return this.suggestTitle;
	}
	public void setSuggestTitle(String suggestTitle) {
		this.suggestTitle = suggestTitle;
	}

}
