package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-02 16:07:48
 */
public class ShopCategoryImage extends AlipayObject {

	private static final long serialVersionUID = 8494281118832658788L;

	/**
	 * 二级类目code。注意这里要填的是【二级code】。
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 二级类目所对应的类目图
文件id 来源于alipay.open.file.upload支付宝文件上传接口
	 */
	@ApiField("category_image")
	private String categoryImage;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryImage() {
		return this.categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

}
