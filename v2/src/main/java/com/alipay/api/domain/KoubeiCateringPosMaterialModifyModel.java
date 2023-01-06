package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改配料
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:23:06
 */
public class KoubeiCateringPosMaterialModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1545167894528542736L;

	/**
	 * 配料id
	 */
	@ApiField("material_id")
	private String materialId;

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
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

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
