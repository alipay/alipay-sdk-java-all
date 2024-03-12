package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡核销的商品范围规则
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardPayEffectiveItemRule extends AlipayObject {

	private static final long serialVersionUID = 5673723385853852519L;

	/**
	 * 统一支付下单传递进来的商品编号，最大列表长度10000
	 */
	@ApiListField("exclude_item_ids")
	@ApiField("string")
	private List<String> excludeItemIds;

	/**
	 * 统一支付下单传递进来的商品编号，最大列表长度10000
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	public List<String> getExcludeItemIds() {
		return this.excludeItemIds;
	}
	public void setExcludeItemIds(List<String> excludeItemIds) {
		this.excludeItemIds = excludeItemIds;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

}
