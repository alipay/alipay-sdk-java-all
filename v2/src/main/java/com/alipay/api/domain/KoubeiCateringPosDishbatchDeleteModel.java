package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除菜品
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:27:05
 */
public class KoubeiCateringPosDishbatchDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4826371748272345265L;

	/**
	 * 菜谱的ID。用于删除菜谱中的菜品
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品ID
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

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

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public List<String> getDishIds() {
		return this.dishIds;
	}
	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
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
