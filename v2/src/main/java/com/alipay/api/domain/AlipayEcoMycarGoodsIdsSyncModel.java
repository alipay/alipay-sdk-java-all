package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车生活车品同步
 *
 * @author auto create
 * @since 1.0, 2024-06-24 11:57:47
 */
public class AlipayEcoMycarGoodsIdsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3877214381741378387L;

	/**
	 * 商品库商品ID集合
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

}
