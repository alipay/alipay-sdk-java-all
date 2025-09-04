package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自建盒子批量转移菜品分类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:50:01
 */
public class KoubeiCateringPosDishcateTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4148958524839361379L;

	/**
	 * 菜类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 菜谱ID
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品ID列表
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
