package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建菜类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:50:33
 */
public class KoubeiCateringPosCategoryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2879829272378459428L;

	/**
	 * 菜类名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 用户ID
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
