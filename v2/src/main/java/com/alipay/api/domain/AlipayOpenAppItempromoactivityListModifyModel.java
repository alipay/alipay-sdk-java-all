package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品营销活动信息接口
 *
 * @author auto create
 * @since 1.0, 2024-06-05 11:03:02
 */
public class AlipayOpenAppItempromoactivityListModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8582511277129672823L;

	/**
	 * 提报的属性信息
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
