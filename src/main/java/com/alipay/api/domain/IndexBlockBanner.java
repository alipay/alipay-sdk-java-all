package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销展位码，用于配置一些图片信息
 *
 * @author auto create
 * @since 1.0, 2019-01-02 15:47:30
 */
public class IndexBlockBanner extends AlipayObject {

	private static final long serialVersionUID = 8422967451615548663L;

	/**
	 * 图片地址，展示需要的图片信息
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 特殊落地页,如果这里没值,会跳到栏目的二级页
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

}
