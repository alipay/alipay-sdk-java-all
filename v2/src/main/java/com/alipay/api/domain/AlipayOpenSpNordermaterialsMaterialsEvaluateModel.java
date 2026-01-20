package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N点餐物料生产后回传核验
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:32:11
 */
public class AlipayOpenSpNordermaterialsMaterialsEvaluateModel extends AlipayObject {

	private static final long serialVersionUID = 8375457285922922496L;

	/**
	 * 生产单号，用于匹配物料信息校验
	 */
	@ApiField("production_order_no")
	private String productionOrderNo;

	/**
	 * 需要回传校验的门店物料信息
	 */
	@ApiListField("shop_materials_valid_info")
	@ApiField("shop_materials_valid_info")
	private List<ShopMaterialsValidInfo> shopMaterialsValidInfo;

	public String getProductionOrderNo() {
		return this.productionOrderNo;
	}
	public void setProductionOrderNo(String productionOrderNo) {
		this.productionOrderNo = productionOrderNo;
	}

	public List<ShopMaterialsValidInfo> getShopMaterialsValidInfo() {
		return this.shopMaterialsValidInfo;
	}
	public void setShopMaterialsValidInfo(List<ShopMaterialsValidInfo> shopMaterialsValidInfo) {
		this.shopMaterialsValidInfo = shopMaterialsValidInfo;
	}

}
