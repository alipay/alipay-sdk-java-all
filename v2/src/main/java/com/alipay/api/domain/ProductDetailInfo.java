package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品明细信息
 *
 * @author auto create
 * @since 1.0, 2024-11-13 17:25:56
 */
public class ProductDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6475468887428913154L;

	/**
	 * 产品一级类目id
	 */
	@ApiField("category_lv_1_code")
	private String categoryLv1Code;

	/**
	 * 产品一级类目名称
	 */
	@ApiField("category_lv_1_name")
	private String categoryLv1Name;

	/**
	 * 产品二级类目id
	 */
	@ApiField("category_lv_2_code")
	private String categoryLv2Code;

	/**
	 * 产品二级类目名称
	 */
	@ApiField("category_lv_2_name")
	private String categoryLv2Name;

	/**
	 * 产品id
	 */
	@ApiField("category_lv_3_code")
	private String categoryLv3Code;

	/**
	 * 产品名称
	 */
	@ApiField("category_lv_3_name")
	private String categoryLv3Name;

	/**
	 * 平台id
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * 商品链接名称
	 */
	@ApiField("product_title")
	private String productTitle;

	public String getCategoryLv1Code() {
		return this.categoryLv1Code;
	}
	public void setCategoryLv1Code(String categoryLv1Code) {
		this.categoryLv1Code = categoryLv1Code;
	}

	public String getCategoryLv1Name() {
		return this.categoryLv1Name;
	}
	public void setCategoryLv1Name(String categoryLv1Name) {
		this.categoryLv1Name = categoryLv1Name;
	}

	public String getCategoryLv2Code() {
		return this.categoryLv2Code;
	}
	public void setCategoryLv2Code(String categoryLv2Code) {
		this.categoryLv2Code = categoryLv2Code;
	}

	public String getCategoryLv2Name() {
		return this.categoryLv2Name;
	}
	public void setCategoryLv2Name(String categoryLv2Name) {
		this.categoryLv2Name = categoryLv2Name;
	}

	public String getCategoryLv3Code() {
		return this.categoryLv3Code;
	}
	public void setCategoryLv3Code(String categoryLv3Code) {
		this.categoryLv3Code = categoryLv3Code;
	}

	public String getCategoryLv3Name() {
		return this.categoryLv3Name;
	}
	public void setCategoryLv3Name(String categoryLv3Name) {
		this.categoryLv3Name = categoryLv3Name;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getProductTitle() {
		return this.productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

}
