package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品虚拟类目菜品查询
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:24:53
 */
public class KoubeiCateringDishVirtualdishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2888822144892795637L;

	/**
	 * 虚拟类目id，如果传入，也会做为查询条件
	 */
	@ApiField("catetory_id")
	private String catetoryId;

	/**
	 * 口碑侧门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCatetoryId() {
		return this.catetoryId;
	}
	public void setCatetoryId(String catetoryId) {
		this.catetoryId = catetoryId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
