package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除商品营销活动接口
 *
 * @author auto create
 * @since 1.0, 2023-09-08 15:06:14
 */
public class AlipayOpenAppItempromoactivityListDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8645741935339225986L;

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
