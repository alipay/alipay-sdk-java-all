package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动商品属性
 *
 * @author auto create
 * @since 1.0, 2023-12-10 18:15:34
 */
public class PromoActivityItemAttrRequest extends AlipayObject {

	private static final long serialVersionUID = 6519174948374492861L;

	/**
	 * 属性列表
	 */
	@ApiListField("activity_attr_list")
	@ApiField("promo_activity_attr_request")
	private List<PromoActivityAttrRequest> activityAttrList;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。该字段特殊可选，与out_item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。该字段特殊可选，与item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public List<PromoActivityAttrRequest> getActivityAttrList() {
		return this.activityAttrList;
	}
	public void setActivityAttrList(List<PromoActivityAttrRequest> activityAttrList) {
		this.activityAttrList = activityAttrList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
