package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付能力推荐信息，包括推荐类型、运营推荐地址等信息
 *
 * @author auto create
 * @since 1.0, 2018-07-11 16:29:38
 */
public class RecommendInfo extends AlipayObject {

	private static final long serialVersionUID = 5348132575994182184L;

	/**
	 * 支付能力聚合页地址，承载支付能力提升的页面地址。
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 推荐运营文案，用于推荐类型为contentPage的场景。
	 */
	@ApiField("recommend_content")
	private String recommendContent;

	/**
	 * 运营投放图片，用于推荐类型为imgPage的场景
	 */
	@ApiField("recommend_img")
	private String recommendImg;

	/**
	 * 支付能力运营推荐类型，包括图片链接及文字链接两种，取值分别为：imgPage、contentPage
	 */
	@ApiField("recommend_type")
	private String recommendType;

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getRecommendContent() {
		return this.recommendContent;
	}
	public void setRecommendContent(String recommendContent) {
		this.recommendContent = recommendContent;
	}

	public String getRecommendImg() {
		return this.recommendImg;
	}
	public void setRecommendImg(String recommendImg) {
		this.recommendImg = recommendImg;
	}

	public String getRecommendType() {
		return this.recommendType;
	}
	public void setRecommendType(String recommendType) {
		this.recommendType = recommendType;
	}

}
