package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增配料
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:23:26
 */
public class KoubeiCateringPosMaterialCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3865235234444988238L;

	/**
	 * 配料名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 售价
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 商户门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
