package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-07-10 11:28:28
 */
public class BrandInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2366533419436589331L;

	/**
	 * 商品所属的品牌ID
	 */
	@ApiField("item_brand_id")
	private String itemBrandId;

	/**
	 * 商品所属的品牌名称
	 */
	@ApiField("item_brand_name")
	private String itemBrandName;

	public String getItemBrandId() {
		return this.itemBrandId;
	}
	public void setItemBrandId(String itemBrandId) {
		this.itemBrandId = itemBrandId;
	}

	public String getItemBrandName() {
		return this.itemBrandName;
	}
	public void setItemBrandName(String itemBrandName) {
		this.itemBrandName = itemBrandName;
	}

}
