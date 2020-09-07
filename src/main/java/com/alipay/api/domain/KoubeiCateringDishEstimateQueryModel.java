package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑估清查询简化接口
 *
 * @author auto create
 * @since 1.0, 2020-09-02 11:51:14
 */
public class KoubeiCateringDishEstimateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2436161821973739513L;

	/**
	 * 外部门店id，外部门店id和口碑门店id，必须二选一必填，当都传入时，以口碑门店id为准
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

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
