package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除菜类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:19:31
 */
public class KoubeiCateringPosCategoryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3179465795592834182L;

	/**
	 * 菜类ID
	 */
	@ApiField("cate_id")
	private String cateId;

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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
