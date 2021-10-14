package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品虚拟类目菜品查询简化接口
 *
 * @author auto create
 * @since 1.0, 2020-12-14 15:05:05
 */
public class KoubeiCateringDishVirtualcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3266357932587361861L;

	/**
	 * 虚拟类目名称
	 */
	@ApiField("catetory_name")
	private String catetoryName;

	/**
	 * 外部门店id，和shop_id二选一必填，当都传时，以shop_id为准
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCatetoryName() {
		return this.catetoryName;
	}
	public void setCatetoryName(String catetoryName) {
		this.catetoryName = catetoryName;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
