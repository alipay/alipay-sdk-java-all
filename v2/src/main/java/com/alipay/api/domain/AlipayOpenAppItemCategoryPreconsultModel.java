package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目预咨询接口
 *
 * @author auto create
 * @since 1.0, 2023-10-19 14:11:38
 */
public class AlipayOpenAppItemCategoryPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 8679796592582275775L;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
