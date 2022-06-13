package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌详情信息
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:29
 */
public class BrandInfos extends AlipayObject {

	private static final long serialVersionUID = 3765444226941647449L;

	/**
	 * 品牌对应的品牌box信息
	 */
	@ApiField("box_exclusive_info")
	private SearchBrandBoxInfo boxExclusiveInfo;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	public SearchBrandBoxInfo getBoxExclusiveInfo() {
		return this.boxExclusiveInfo;
	}
	public void setBoxExclusiveInfo(SearchBrandBoxInfo boxExclusiveInfo) {
		this.boxExclusiveInfo = boxExclusiveInfo;
	}

	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
