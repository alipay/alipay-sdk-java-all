package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动画信息
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:39:04
 */
public class RoboAnimation extends AlipayObject {

	private static final long serialVersionUID = 2414912249637295282L;

	/**
	 * 动画id
	 */
	@ApiField("animation_id")
	private String animationId;

	/**
	 * 动画链接
	 */
	@ApiField("animation_url")
	private String animationUrl;

	/**
	 * 示例图
	 */
	@ApiField("example_image_url")
	private String exampleImageUrl;

	/**
	 * 动画排序字段
	 */
	@ApiField("sort")
	private String sort;

	public String getAnimationId() {
		return this.animationId;
	}
	public void setAnimationId(String animationId) {
		this.animationId = animationId;
	}

	public String getAnimationUrl() {
		return this.animationUrl;
	}
	public void setAnimationUrl(String animationUrl) {
		this.animationUrl = animationUrl;
	}

	public String getExampleImageUrl() {
		return this.exampleImageUrl;
	}
	public void setExampleImageUrl(String exampleImageUrl) {
		this.exampleImageUrl = exampleImageUrl;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
