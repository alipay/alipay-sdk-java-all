package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于表示商品展示图库信息
 *
 * @author auto create
 * @since 1.0, 2026-05-12 10:16:46
 */
public class GoodsImageInfo extends AlipayObject {

	private static final long serialVersionUID = 2174816938383648728L;

	/**
	 * 图片地址
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 展示图位置
	 */
	@ApiField("sort")
	private String sort;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
