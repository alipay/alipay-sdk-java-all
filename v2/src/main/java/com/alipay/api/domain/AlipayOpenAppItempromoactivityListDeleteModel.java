package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除商品营销活动接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 10:28:05
 */
public class AlipayOpenAppItempromoactivityListDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1811537779572821951L;

	/**
	 * 商品及其属性列表
	 */
	@ApiListField("item_list")
	@ApiField("promo_activity_item_request")
	private List<PromoActivityItemRequest> itemList;

	/**
	 * 营销活动类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	public List<PromoActivityItemRequest> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<PromoActivityItemRequest> itemList) {
		this.itemList = itemList;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

}
