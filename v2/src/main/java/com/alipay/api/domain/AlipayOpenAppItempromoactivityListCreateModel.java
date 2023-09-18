package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量创建商品营销活动接口
 *
 * @author auto create
 * @since 1.0, 2023-09-12 19:07:51
 */
public class AlipayOpenAppItempromoactivityListCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8567228794475337749L;

	/**
	 * 批量创建商品营销活动记录
	 */
	@ApiListField("item_attr_list")
	@ApiField("promo_activity_item_attr_request")
	private List<PromoActivityItemAttrRequest> itemAttrList;

	/**
	 * 营销活动类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	public List<PromoActivityItemAttrRequest> getItemAttrList() {
		return this.itemAttrList;
	}
	public void setItemAttrList(List<PromoActivityItemAttrRequest> itemAttrList) {
		this.itemAttrList = itemAttrList;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

}
