package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 描述菜品信息
 *
 * @author auto create
 * @since 1.0, 2019-08-30 20:12:00
 */
public class ShieldDishList extends AlipayObject {

	private static final long serialVersionUID = 1418765463593622762L;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 菜品数量
	 */
	@ApiField("num")
	private String num;

	/**
	 * 菜品下细分的sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
