package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐区开台菜
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:19
 */
public class KbdishAreaFreeInfo extends AlipayObject {

	private static final long serialVersionUID = 3583498958684919697L;

	/**
	 * 餐区id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 份数
	 */
	@ApiField("count")
	private String count;

	/**
	 * 口碑菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * sku_id
	 */
	@ApiField("dish_sku_id")
	private String dishSkuId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishSkuId() {
		return this.dishSkuId;
	}
	public void setDishSkuId(String dishSkuId) {
		this.dishSkuId = dishSkuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
