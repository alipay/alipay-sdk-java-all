package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟类目菜品删除简化接口
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:33:14
 */
public class KoubeiCateringDishVirtualcategoryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4813493928754756138L;

	/**
	 * 如果需要删除某一个类目时传入
	 */
	@ApiField("catetory_name")
	private String catetoryName;

	/**
	 * 外部门店id，与口碑门店id二选一必填，如果都填，以口碑门店id为准
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店id
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
