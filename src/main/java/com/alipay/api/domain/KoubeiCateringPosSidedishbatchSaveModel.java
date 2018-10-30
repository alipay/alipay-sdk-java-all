package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加配菜
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:21:12
 */
public class KoubeiCateringPosSidedishbatchSaveModel extends AlipayObject {

	private static final long serialVersionUID = 4329646664793396927L;

	/**
	 * 需要添加配菜的菜品ID
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	/**
	 * 批量添加的配菜
	 */
	@ApiListField("dish_material_list")
	@ApiField("pos_dish_material_model")
	private List<PosDishMaterialModel> dishMaterialList;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<String> getDishIds() {
		return this.dishIds;
	}
	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}

	public List<PosDishMaterialModel> getDishMaterialList() {
		return this.dishMaterialList;
	}
	public void setDishMaterialList(List<PosDishMaterialModel> dishMaterialList) {
		this.dishMaterialList = dishMaterialList;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
