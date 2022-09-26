package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新菜类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:20:07
 */
public class KoubeiCateringPosCategoryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5585188371566749518L;

	/**
	 * 类别ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 菜类名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
